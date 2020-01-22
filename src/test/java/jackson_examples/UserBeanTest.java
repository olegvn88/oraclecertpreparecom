package jackson_examples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ke.serialisation_example.jackson_examples.example1.*;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserBeanTest {

    @Test
    public void testUeserBean() throws JsonProcessingException {
        UserBean userBean = new UserBean(1, "John");
        String resultJson = new ObjectMapper().writeValueAsString(userBean);
        System.out.println(resultJson);
        assertThat(resultJson.contains("id"));
        assertThat(resultJson.contains("firstName"));
    }

    @Test
    public void testUserGetterBean() throws JsonProcessingException {
        UserGetterBean userGetterBean = new UserGetterBean(1, "Oleg");
        String jsonResponse = new ObjectMapper().writeValueAsString(userGetterBean);
        System.out.println(jsonResponse);
        assertThat(jsonResponse).contains("id");
        assertThat(jsonResponse).contains("family");
    }

    @Test
    public void testUserPropertyBean() throws JsonProcessingException {
        UserPropertyBean userPropertyBean = new UserPropertyBean(1, "Oleg");
        String jsonResponse = new ObjectMapper().writeValueAsString(userPropertyBean);
        System.out.println(jsonResponse);
        assertThat(jsonResponse).contains("id");
        assertThat(jsonResponse).contains("name");
    }

    @Test
    public void testUserValueBean() throws JsonProcessingException {
        UserValueBean userValueBean = new UserValueBean(1, "Oleg");
        String jsonResult = new ObjectMapper().writeValueAsString(userValueBean);
        System.out.println(jsonResult);
        assertThat(jsonResult).contains("UserValueBean");
    }

    @Test
    public void testUserValueEnum() throws JsonProcessingException {
        String jsonResult = new ObjectMapper().writeValueAsString(UserValueEnum.FIRST_NAME);
        System.out.println(jsonResult);
        assertThat(jsonResult).isEqualTo("\"Michael\"");
    }

    @Test
    public void testUserNotNullValue() throws JsonProcessingException {
        UserNotNullValue userNotNullValue = new UserNotNullValue(1, "Oleg");
        String jsonresult = new ObjectMapper().writeValueAsString(userNotNullValue);
        System.out.println(jsonresult);
        assertThat(jsonresult).doesNotContain("secondName");
    }

    @Test
    public void testUserView() {
    }
}
