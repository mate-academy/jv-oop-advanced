package core.basesyntax;
public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("All dimensions must be positive");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + this.area() + " sq. units, width: "
                + this.width + ", height: "
                + this.height + ", color: " + getColor());
    }
}
