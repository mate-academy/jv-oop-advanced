package core.basesyntax;

public class RightTriangle extends Figure {
    private final double leftSide;
    private final double rightSide;

    public RightTriangle(String color, double leftSide, double rightSide) {
        super(color);
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    @Override
    public double getArea() {
        return leftSide * rightSide / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, area " + getArea()
                + " sq.units, first leg: " + leftSide
                + " units, second leg: "
                + rightSide + "units, color: " + color);

    }
}
