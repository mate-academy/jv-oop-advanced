package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideOne;
    private final double sideTwo;

    public Rectangle(String name, double sideOne, double sideTwo, String color) {
        super(name, color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double calculateArea() {
        return sideOne * sideTwo;
    }

    @Override
    public String draw() {
        return "Name = " + getName() + " Area = " + calculateArea()
                + " First side = " + sideOne + " Second side = "
                + sideTwo + " Color = " + getColor();
    }
}
