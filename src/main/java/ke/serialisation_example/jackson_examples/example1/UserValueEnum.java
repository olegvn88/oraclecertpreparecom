package ke.serialisation_example.jackson_examples.example1;

import com.fasterxml.jackson.annotation.JsonValue;

public enum  UserValueEnum {

    FIRST_NAME("Michael"),
    LAST_NAME("Jackson");

    private String name;

    UserValueEnum(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }
}
