package softserve_dumps.dump2;

public class Question15 {
}

interface Shape {
    public long getArea();
    public int getPerimeter();
}
class Rectangle implements Shape {
    public int getWidthLength() { return 1; }
    public int getHeighLength() { return 1;    }
    public double getAngle() { return 1;    }
    public long getArea() { return 1 * 1;    }
    public int getPerimeter() { return 2 * (1 + 1);    }
}

class Square extends Rectangle {
    public int getSideLength() { return 1; }
}
class Rhombus extends Square {
    public Rhombus(int i, int i1, int i2) { }
    public double getAngle1() { return 1;    }
    public double getAngle2() { return 1;    }

    public static void main(String[] main) {
        Shape sh = new Rhombus(5, 65, 115);

        Square sq = (Square) sh;

        sq.getHeighLength();
        sq.getWidthLength();
        sq.getAngle();
        sq.getAngle();
        sq.getPerimeter();
    }
}
