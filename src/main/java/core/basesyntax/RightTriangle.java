package core.basesyntax;

public class RightTriangle extends Figure {
    private int length;
    private int height;

    public RightTriangle(String color, int length, int height) {
        super(color);
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * length * height;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: " + getArea()
                + " sq.units, length: " + length
                + " units, height: " + height
                + " units, color: " + color;
    }
}
