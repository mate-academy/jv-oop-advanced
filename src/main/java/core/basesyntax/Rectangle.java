package core.basesyntax;

public class Rectangle extends Figure {
    private double sideOne;
    private double sideTwo;

    public Rectangle(String color, String figuresName, double sideOne, double sideTwo) {
        super(color, figuresName);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, first side length: " + sideOne + "units, second side length: "
                + sideTwo + " units, color: " + getColor());
    }
}
