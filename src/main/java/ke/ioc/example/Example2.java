package ke.ioc.example;

public class Example2 {

    public static void main(String[] args) {
        Speaker spechWriter = new Speaker(new GoSpeachWriter());
        spechWriter.speak();
        Speaker helloWriter = new Speaker(new HelloSpeachWriter());
        helloWriter.speak();
    }
}

class Speaker {
    private SpechWriter writer;

    public Speaker(SpechWriter writer) {
        this.writer = writer;
    }

    public void speak() {
        System.out.println(writer.getSpeach());
    }
}

interface SpechWriter {
    public String getSpeach();
}

class HelloSpeachWriter implements SpechWriter {
    public String getSpeach() {
        return "Hello guys";
    }
}

class GoSpeachWriter implements SpechWriter {
    public String getSpeach() {
        return "Go go go";
    }
}