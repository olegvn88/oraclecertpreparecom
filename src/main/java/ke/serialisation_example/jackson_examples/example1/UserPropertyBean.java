package ke.serialisation_example.jackson_examples.example1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPropertyBean {

    public int id;

    @JsonProperty("name")
    private String firstName;

    public UserPropertyBean(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    @JsonProperty("first-name")
    public String getFirstName() {
        return firstName;
    }
}
