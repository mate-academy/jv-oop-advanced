package core.basesyntax;

public class Rectangle extends Figure {

    private final int sideOne;
    private final int sideTwo;

    public Rectangle(int sideOne, int sideTwo, String color) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        setColor(color);
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }

    @Override
    public void print() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, side a: "
                + sideOne + ", side b: " + sideTwo + " units, color:" + getColor());
    }

}
