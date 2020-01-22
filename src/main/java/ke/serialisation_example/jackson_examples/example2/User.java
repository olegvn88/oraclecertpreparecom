package ke.serialisation_example.jackson_examples.example2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.IOException;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class User {
    public int id;
    String firstName;
    int age;
    Contacts contacts;
    String language;
    Availability available;
    Status status;

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public Contacts setContacts(Contacts contacts) {
        this.contacts = contacts;
        return contacts;
    }

    public String getLanguage() {
        return language;
    }

    public User setLanguage(String language) {
        this.language = language;
        return this;
    }

    public Availability getAvailable() {
        return available;
    }

    public Availability setAvailable(Availability available) {
        this.available = available;
        return available;
    }

    public Status getStatus() {
        return status;
    }

    public Status setStatus(Status status) {
        this.status = status;
        return status;
    }

    public User endUser(){
        return this;
    }
}

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
class Availability {
    String hired;
    Status free;

    public String getHired() {
        return hired;
    }

    public Availability setHired(String hired) {
        this.hired = hired;
        return this;
    }

    public Status getFree() {
        return free;
    }

    public Availability setFree(Status free) {
        this.free = free;
        return this;
    }

    public User endAvailability() {
        return new User();
    }
}

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
class Status {
    String activeSearch;
    boolean notActiveSearch;

    public String getActiveSearch() {
        return activeSearch;
    }

    public void setActiveSearch(String activeSearch) {
        this.activeSearch = activeSearch;
    }

    public boolean isNotActiveSearch() {
        return notActiveSearch;
    }

    public void setNotActiveSearch(boolean notActiveSearch) {
        this.notActiveSearch = notActiveSearch;
    }
}

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
class Contacts {

    @JsonProperty("Country")
    String country;
    String city;
    String street;
    String phone;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

@Getter
@Setter
class Builder {
    private User user;
    private Contacts contacts;
    private Status status;
    private Availability availability;

    public Builder() {
        this.user = new User();
        this.contacts = new Contacts();
        this.status = new Status();
        this.availability = new Availability();

        user.setAvailable(availability);
        user.setContacts(contacts);
        user.setStatus(status);
    }

    public User build() {
        user.setContacts(contacts);
        contacts.setCountry("Ukraine");
        contacts.setCity("Kyiv");
        user.setStatus(status);
        status.setActiveSearch("false");

        return user;
    }
}