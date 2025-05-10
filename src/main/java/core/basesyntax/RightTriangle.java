package core.basesyntax;

public class RightTriangle extends Figure {
    private double width;
    private double height;

    public RightTriangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return "right_triangle";
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + " area: " + getArea() + " sq.units, height: "
                + height + " units, width: " + width + " units, color: " + getColor());
    }
}
