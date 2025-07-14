package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double side;

    public RightTriangle(Color color, double base, double side) {
        super(color);
        this.base = base;
        this.side = side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 0.5 * base * side;
    }

    @Override
    public String getInfo() {
        return "RightTriangle{base=" + base + ";side=" + side + "}";
    }
}
