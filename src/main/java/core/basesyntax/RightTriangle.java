package core.basesyntax;

public class RightTriangle extends Figure {
    private double width;
    private double height;

    public RightTriangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + "sq. units, width: "
                + width + " units, height: " + height + " units, color: " + getColor());
    }
}
