package core.basesyntax;

public class Rectangle extends Figure {
    private int sideOne;
    private int sideTwo;

    public int getSideOne() {
        return sideOne;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, side one: "
                + sideOne + " side two: " + sideTwo + " color: " + getColor().toLowerCase());
    }
}
