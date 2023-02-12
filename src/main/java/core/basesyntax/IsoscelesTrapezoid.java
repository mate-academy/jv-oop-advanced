package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double rightSide;
    private double leftSide;
    private double height;

    public IsoscelesTrapezoid(String color, double rightSide, double leftSide, double height) {
        super(color);
        this.rightSide = rightSide;
        this.leftSide = leftSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (rightSide + leftSide) / 2 * height;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + getArea()
                + " units, rightSide: "
                + rightSide
                + " units, leftSide: "
                + leftSide
                + " units, height: "
                + height
                + " units, color: "
                + color);
    }
}
