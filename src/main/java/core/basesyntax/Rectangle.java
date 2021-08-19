package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private double rightSide;
    private double downSide;

    public Rectangle(double rightSide, double downSide, String color) {
        super(color);
        this.rightSide = rightSide;
        this.downSide = downSide;
    }

    @Override
    public double getArea() {
        return rightSide * downSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq.units, rightSide: " + rightSide + " units, downSide: "
                + downSide + " units, color: " + getColor());
    }
}
