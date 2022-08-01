package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideOne;
    private final double sideTwo;

    public Rectangle(String color, double sideOne, double sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }

    @Override
    public void drawing() {
        System.out.println("Figure: Rectangle, area: " + getArea() + ", sideOne: " + getSideOne()
                + ", sideTwo: " + getSideTwo() + ", color: " + getColor());
    }
}
