package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, Drawable {
    private double width;
    private double height;
    private String color;

    public RightTriangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
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
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return (width * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + " area: " + area() + " sq.units, height: "
                + getHeight() + " units, wigth: " + getWidth() + " units, color: " + color());
    }
}
