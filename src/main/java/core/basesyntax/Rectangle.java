package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideOne;
    private final double sideTwo;

    public Rectangle(String color, double sideOne, double sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }
}
