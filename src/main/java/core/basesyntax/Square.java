package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super("Square", color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void displayInfo() {
        System.out.println("Figure: square"
                + ", area: " + getArea() + " sq.units"
                + ", width: " + side
                + ", color: " + getColor());
    }
}
