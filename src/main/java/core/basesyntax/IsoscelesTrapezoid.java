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
    public double calculateArea() {
        return (rightSide + leftSide) / 2 * height;
    }

    @Override
    public void printer() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + calculateArea()
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
