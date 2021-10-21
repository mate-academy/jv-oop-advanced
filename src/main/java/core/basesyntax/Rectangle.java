package core.basesyntax;

public class Rectangle extends Figure {
    private double sideOne;
    private double sideTwo;

    public Rectangle(String color, double sideOne, double sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area = " + getArea() + " sq.units,"
                + " side one = " + sideOne + " units,"
                + " side two = " + sideTwo + " units,"
                + " color = " + getColor());
    }
}
