package ke.serialisation_example.jackson_examples.example1;

import com.fasterxml.jackson.annotation.JsonValue;

public class UserValueBean {
    public int id;
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public UserValueBean(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    @JsonValue
    public String toJsonValue() {
        return toString();
    }

    @Override
    public String toString() {
        return "UserValueBean{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
