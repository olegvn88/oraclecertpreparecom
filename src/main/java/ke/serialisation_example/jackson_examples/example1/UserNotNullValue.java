package ke.serialisation_example.jackson_examples.example1;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserNotNullValue {
    public int id;
    public String firstName;
    public String secondName;

    public String nationality;

    public UserNotNullValue(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }
}
