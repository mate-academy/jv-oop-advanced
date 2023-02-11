package core.basesyntax;

public class RightTriangle extends Figure {
    private final double base;
    private final double height;

    public RightTriangle(Color color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + Figures.RightTriangle.name()
                + ", area:" + getArea()
                + ", sq.units, base:" + base
                + ", units, height: " + height
                + ", units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (base * height) * 0.5;
    }
}
