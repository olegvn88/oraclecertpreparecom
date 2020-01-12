package ke.serialisation_example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileOutputStream;

public class Employee {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private String name;
    private Integer salary;
    private String[] skills;
    private Address address;

    //Getter and setter methods
}
class Address {
    private Long id;
    private String city;
    private String country;
    private String pin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
//Getter and Setter methods

}

class JacksonPojoToJson {
    public static void main(String[] args) throws Exception {

        // Create ObjectMapper
        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

        Employee employee = new Employee();
        employee.setId(2005l);
        employee.setName("John Doe");
        employee.setSalary(40000);
        employee.setSkills(new String[] { "Java", "SQL", "jQuery" });

        Address address = new Address();
        address.setId(100L);
        address.setCity("Delhi");
        address.setCountry("India");
        address.setPin("231245");

        employee.setAddress(address);

        // Convert object to JSON string
        String json = mapper.writeValueAsString(employee);
        System.out.println(json);

        // Save JSON string to file
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/out/employee.json");
        mapper.writeValue(fileOutputStream, employee);
        fileOutputStream.close();
    }
}
