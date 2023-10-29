package core.basesyntax;

public class RightTriangle extends Figure {
    private double rightTriangleSide;

    public RightTriangle(Color color, double rightTriangleSide) {
        super(color);
        this.rightTriangleSide = rightTriangleSide;
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
