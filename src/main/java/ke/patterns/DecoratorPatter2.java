package ke.patterns;

import java.util.ArrayList;
import java.util.List;

public class DecoratorPatter2 {
    public static void main(String[] args) {
        MessageNotifierDecorator message = new Slack(new MessageNotifier());
//        message.sendMassage("New message2");
        message.sendMassage("New message4");
//        System.out.println(message.list.get(0));
    }
}

interface Message {
    void sendMassage(String message);

    String readMesage();
}

class MessageNotifier implements Message {

    List<String> list = new ArrayList<>();

    @Override
    public void sendMassage(String message) {
        list.add(message);
    }

    @Override
    public String readMesage() {
        String message = "";
        for (int i = 0; i < list.size(); i++) {
            message = list.get(i);
        }
        return message;
    }
}

class MessageNotifierDecorator extends MessageNotifier {
    private Message message;

    public MessageNotifierDecorator(Message MessageText) {
        this.message = MessageText;
    }

    @Override
    public void sendMassage(String MessageText) {
      message.sendMassage(MessageText);
    }

    @Override
    public String readMesage() {
        return message.readMesage();
    }
}

class Slack extends MessageNotifierDecorator {

    public Slack(Message MessageText) {
        super(MessageText);
    }

    @Override
    public void sendMassage(String MessageText) {
        list.add(MessageText + "-- " + sendMassageToSlackChannels());
        super.sendMassage(sendMassageToSlackChannels());
    }

    public String sendMassageToSlackChannels() {
       return "send message to slack channels";
    }
}