package core.basesyntax;

public class Rectangle extends Figure {
    private double sideOne;
    private double sideTwo;

    public Rectangle(String color, double sideOne, double sideTwo) {
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
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq.units, sideOne: " + sideOne
                + " units, sideTwo: " + sideTwo
                + " units, color: " + color);
    }
}
