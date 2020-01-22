package ke.serialisation_example.jackson_examples.temp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.IOException;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class UserDefaultValueBean {
    public int id;
    String firstName;
    int age;
    Contacts contacts;
    String language;
    Availability available;
    Status status;
}

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
class Availability {
    boolean hired;
    Status free;
}


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
class Status {
    String activeSearch;
    boolean notActiveSearch;
}

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
class Contacts {

    @JsonProperty("Country")
    String country;
    String city;
    String street;
    String phone;
}


class Creator {
    public static void main(String[] args) throws IOException {
        createJsonOutput();
        createJsonFile();
    }

    private static void createJsonOutput() throws IOException {
        UserDefaultValueBean userDefaultValueBean = createJson();
        ObjectMapper mapper = new ObjectMapper();//.enable(SerializationFeature.INDENT_OUTPUT);
        String jsonResult = mapper.writeValueAsString(userDefaultValueBean);
        System.out.println(jsonResult);
    }

    private static void createJsonFile() throws IOException {
        ObjectWriter writer = new ObjectMapper().writer(new DefaultPrettyPrinter());
        writer.writeValue(new File("src/main/java/ke/serialisation_example/jackson_examples/account.json"), createJson());
    }

    public static UserDefaultValueBean createJson() {
        UserDefaultValueBean userDefaultValueBean = new UserDefaultValueBean();
        Contacts contacts = new Contacts();
        Status status = new Status();
        Availability availability = new Availability();
        userDefaultValueBean.setAge(31);
        userDefaultValueBean.setFirstName("Oleg");
        userDefaultValueBean.setAvailable(availability);
        availability.setHired(true);
        userDefaultValueBean.setContacts(contacts);
        contacts.setCountry("Ukraine");
        contacts.setCity("Kyiv");
        userDefaultValueBean.setStatus(status);
        status.setActiveSearch("false");
        return userDefaultValueBean;
    }
}