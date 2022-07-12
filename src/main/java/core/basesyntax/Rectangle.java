package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideOne;
    private final double sideTwo;

    public Rectangle(String color, int sideOne, int sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square; area: " + getArea() + " square units;"
                + " side one: " + sideOne + " units;"
                + " side two: " + sideTwo + " units; "
                + getColor());
    }
}
