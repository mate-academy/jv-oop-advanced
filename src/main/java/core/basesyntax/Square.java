package core.basesyntax;

public class Square extends Figure {
    private double foreEquelLegs;

    public Square(double foreEquelLegs, String color) {
        super("Square", color);
        this.foreEquelLegs = foreEquelLegs;
    }

    @Override
    public double getArea() {
        return Math.pow(foreEquelLegs, 2);
    }

    @Override
    public void displayInfo() {
        System.out.println("Figure: square"
                + ", area: " + getArea() + " sq.units"
                + ", width: " + foreEquelLegs
                + ", color: " + super.getColor());
    }
}
