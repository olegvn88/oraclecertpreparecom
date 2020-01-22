package ke.serialisation_example.jackson_examples.example2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Builder builder = new Builder();
        builder.getUser().setAge(31);
        builder.getUser().setFirstName("Oleg");
        builder.getAvailability().setHired("false");
        User user = builder.build();

        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        String jsonResult = mapper.writeValueAsString(user);
        System.out.println(jsonResult);
    }
}
