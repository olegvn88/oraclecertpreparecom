package softserve_dumps.dump2;

public class Question16 {
    public Question16(Color color, Suit suit) {
        this.color = color;
        this.suit = suit;
    }

    enum Suit {CLUB, DIAMOND, HEART, SPADE}

    enum Color {BLACK, RED}

    private Color color;
    private Suit suit;

    public static void main(String[] args) {
        Question16 q = new Question16(Color.RED, Suit.CLUB);
        System.out.println(q.color + " : " + q.suit);
    }
}

abstract class Product333{
    abstract void getPrice();
    abstract void getProductList();
}

class Sales extends Product333{
    public static void main(String[] args) {
    }
    @Override
    void getPrice() {

    }

    @Override
    void getProductList() {

    }
}