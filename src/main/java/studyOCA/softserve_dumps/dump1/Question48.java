package studyOCA.softserve_dumps.dump1;

public interface Question48 {
}

abstract class PlayingCard implements Question48 {}

class PockerCard extends PlayingCard {}

class FlashCard implements Question48 {}

class NoteCard implements Question48 {
}

class Game {
    public static void main(String[] args) {
        Question48 c = new FlashCard();
        System.out.println((c instanceof Question48) ? "Card!" : "Not Card?");
        System.out.println((c instanceof PlayingCard) ? "PlayingCard!" : "Not PlayingCard?");
        System.out.println((c instanceof FlashCard) ? "FlashCard!" : "Not FlashCard?");
        System.out.println((c instanceof NoteCard) ? "NoteCard!" : "Not NoteCard?");
    }
}