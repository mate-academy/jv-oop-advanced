package core.basesyntax;

public class Rectangle extends Figure {
    private double legA;
    private double legB;

    public Rectangle(double legA, double legB, String color) {
        super("Rectangle", color);
        this.legA = legA;
        this.legB = legB;
    }

    @Override
    public double getArea() {
        return legA * legB;
    }

    @Override
    public void displayInfo() {
        System.out.println("Figure: right triangle"
                + ", area: " + getArea() + " sq.units"
                + ", length: " + legA
                + ", width: " + legB
                + ", color: " + getColor());
    }
}
