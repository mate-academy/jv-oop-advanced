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
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea() + " sq. units, width: " + width
                + ", height: " + height + ", color: " + color);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
