package studyOCA.oca_guide;

import java.util.ArrayList;
import java.util.List;

public class Q9 {
}

interface CanSwim {
}

class Amphibian implements CanSwim {
}

class Tadpole extends Amphibian {
}

 class FindAllTadPole {
    public static void main(String[] args) {
        List<Tadpole> tadpoles = new ArrayList<Tadpole>();
        for (Amphibian amphibian : tadpoles) {
            Amphibian tadpole = amphibian;
        }
    }
}