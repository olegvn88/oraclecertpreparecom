package ke.serialisation_example.jackson_examples.example1;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserGetterBean {
    public int id;

    private String firstName;

    public String country;

    @JsonGetter("name")
    public String getFirstName() {
        return firstName;
    }

    @JsonGetter("family")
    public String getLastName(){
        return "Jackson";
    }

    public UserGetterBean(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }
}
