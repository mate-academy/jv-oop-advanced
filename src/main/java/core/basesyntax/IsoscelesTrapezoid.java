package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int edgeA;
    private int edgeB;
    private int height;

    public IsoscelesTrapezoid(int edgeA, int edgeB, int height, String color) {
        super(color);
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (edgeA + edgeB) / 2 * height;
    }

    @Override
    public String getDraw() {
        return "Figure: isosceles trapezoid, area: " + getArea() + ", edge A: " + edgeA
                + ", edge B: " + edgeB + ", height: " + height + ", color: " + getColor();
    }
}
