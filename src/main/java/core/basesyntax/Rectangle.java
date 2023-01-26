package core.basesyntax;

public class Rectangle extends Figure {
    private double sideOne;
    private double sideTwo;

    public Rectangle(Color color, double sideOne, double sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double areaCalculator() {
        return sideOne * sideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + areaCalculator()
                + " sq.units, First side: " + sideOne + " units, Second side: " + sideTwo
                + " units, color: " + getColor());
    }
}
