package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(String color, double base, double height) {
        super(color, FigureList.RIGHT_TRIANGLE.name());
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2.0;
    }

    @Override
    public String getFigureData() {
        return base + " " + height;
    }
}
