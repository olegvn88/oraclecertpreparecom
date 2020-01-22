package ke.serialisation_example.jackson_examples.example1;

public class UserBean {
    public int id;
    private String firstName;

    public float getVersion(){
        return 1.0f;
    }

    public String getFirstName() {
        return firstName;
    }


    public UserBean(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }
}
