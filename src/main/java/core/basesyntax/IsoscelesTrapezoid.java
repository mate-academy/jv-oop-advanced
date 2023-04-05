package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int leftSide;
    private final int rightSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int leftSide, int rightSide, int height) {
        super(color);
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (leftSide + rightSide) / 2 * height;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea()
                + "sq.units, leftSide: " + leftSide
                + "units, rightSide: " + rightSide
                + "units, height: " + height
                + "units, color: " + getColor());
    }
}
