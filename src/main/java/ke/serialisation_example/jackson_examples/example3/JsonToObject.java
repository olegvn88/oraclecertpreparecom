package ke.serialisation_example.jackson_examples.example3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.print.attribute.standard.PrinterIsAcceptingJobs;
import java.io.File;
import java.io.IOException;

public class JsonToObject {
    public static void main(String[] args) throws IOException {

        String json = "{\n" +
                "  \"firstName\" : \"Oleg\",\n" +
                "  \"age\" : 31,\n" +
                "  \"contacts\" : {\n" +
                "    \"city\" : \"Kyiv\",\n" +
                "    \"Country\" : \"Ukraine\"\n" +
                "  },\n" +
                "  \"available\" : {\n" +
                "    \"hired\" : true\n" +
                "  },\n" +
                "  \"status\" : {\n" +
                "    \"activeSearch\" : \"false\"\n" +
                "  }\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper();
//        mapper.readValue(json, PojoClass.class);
        PojoClass pojoClass = mapper.readValue(new File("src/main/java/ke/serialisation_example/jackson_examples/account.json"), PojoClass.class);
        System.out.println(pojoClass);
    }
}

class PojoClass {

}
