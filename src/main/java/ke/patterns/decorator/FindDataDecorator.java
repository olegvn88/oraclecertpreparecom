package ke.patterns.decorator;

public class FindDataDecorator extends DataSourceDecorator {
    public FindDataDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data);
    }

    @Override
    public String readData() {
        return findByWord(super.readData());
    }

    private String findByWord(String word) {
        if (word.contains("John")) {
        return "John";
        } else {
            return word;
        }
    }
}
