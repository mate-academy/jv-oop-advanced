package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideOne;
    private final double sideTwo;

    public Rectangle(String name, double sideOne, double sideTwo, String color) {
        setName(name);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        setColor(color);
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
