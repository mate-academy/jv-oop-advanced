package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * this.base * this.height;
    }

    @Override
    public void printInfoFigure() {
        System.out.println("Figure: rightTriangle, area: " + getArea() + " sq.units,"
                + " base: " + getBase() + " units,"
                + " height: " + getHeight() + " units,"
                + " color: " + getColor());
    }
}
