package core.basesyntax;

public class RightTriangle extends Figure {
    private int width;
    private int height;

    public RightTriangle(Color color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea() + " sq.units, width: "
                + width + " units, height: "
                + height + " units, color: " + getColor().name().toLowerCase());
    }
}
