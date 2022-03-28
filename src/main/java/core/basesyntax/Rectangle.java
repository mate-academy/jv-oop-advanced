package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(String color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public double areaCount(int side1, int side2) {
        return side1 * side2;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + areaCount(getSide1(), getSide2())
                + " sq.units, side1: " + side1
                + " side2: " + side2 + " units, color: " + getColor();
    }

}
