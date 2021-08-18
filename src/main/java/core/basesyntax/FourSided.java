package core.basesyntax;

public abstract class FourSided extends Figure {
    private int side1;
    private int side2;
    private int side3;
    private int side4;

    public FourSided(String name, String color, int bottomSide,
                     int topSide, int leftSide, int rightSide) {
        super(name, color);
        this.side1 = bottomSide;
        this.side2 = topSide;
        this.side3 = leftSide;
        this.side4 = rightSide;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public int getSide4() {
        return side4;
    }
}
