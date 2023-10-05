package core.basesyntax;

public class RightTriangle extends Figure {
    private double rightTriangleSide;

    public RightTriangle(double area, Color color, double rightTriangleSide) {
        super(area, color);
        this.rightTriangleSide = rightTriangleSide;
    }

    public RightTriangle() {

    }

    private double getHeight() {
        return Math.sqrt(getRightTriangleSide() * getRightTriangleSide()
                - (0.5 * getRightTriangleSide()) * (0.5 * getRightTriangleSide()));
    }

    @Override
    public double countArea() {
        return 0.5 * getRightTriangleSide() * getHeight();
    }

    public double getRightTriangleSide() {
        return rightTriangleSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: "
                + countArea() + " sq.units, side: "
                + getRightTriangleSide() + " units, color: "
                + getColor());
    }
}
