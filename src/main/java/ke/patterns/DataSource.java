package ke.patterns;

public interface DataSource {
    void writeData(String data);

    String readData();
}
