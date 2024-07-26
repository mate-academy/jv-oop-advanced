package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(String color, double base, double secondLeg) {
        super(color, FigureList.RIGHT_TRIANGLE.name());
        this.base = base;
        this.height = secondLeg;
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
