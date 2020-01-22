package ke.serialisation_example.jackson_examples.example1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class CompanyViews {

    public static class Normal {
    }

    public static class Manager extends Normal {
    }
}

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class UserViewBean {

    @JsonView(CompanyViews.Normal.class)
    private String name;

    @JsonView(CompanyViews.Manager.class)
    private String[] position;

    @JsonView(CompanyViews.Manager.class)
    public String lastName;

    @JsonView(CompanyViews.Normal.class)
    private int age;

    @JsonView(CompanyViews.Manager.class)
    private List<String> skills;

    @JsonView(CompanyViews.Manager.class)
    private Map<String, BigDecimal> salary;
}

class Runner {
    public static void main(String[] args) throws JsonProcessingException {
        UserViewBean userViewBean = createUser();

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String normalView = objectMapper.writerWithView(CompanyViews.Normal.class)
                .writeValueAsString(userViewBean);
        System.out.format("Normal views\n%s\n", normalView);

        String managerView = objectMapper.writerWithView(CompanyViews.Manager.class)
                .writeValueAsString(userViewBean);
        System.out.format("Manager views\n%s\n", managerView);
    }

    private static UserViewBean createUser() {
        UserViewBean userViewBean = new UserViewBean();

        userViewBean.setName("Oleg");
        userViewBean.setPosition(new String[]{"Founder", "CTO", "Writer"});
        userViewBean.setAge(38);
        userViewBean.setLastName("Nesterov");
        Map<String, BigDecimal> salary = new HashMap() {{
            put("2012", new BigDecimal(12000));
            put("2010", new BigDecimal(10000));
            put("2018", new BigDecimal(14000));
        }};
        userViewBean.setSkills(Arrays.asList("java", "python", "node", "kotlin"));
        userViewBean.setSalary(salary);

        return userViewBean;
    }
}