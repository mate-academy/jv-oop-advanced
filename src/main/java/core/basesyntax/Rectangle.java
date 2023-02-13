package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle() {
        super();
    }
    public Rectangle(String color, double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + Double.toString(getArea())
            + ", perimeter: " + Double.toString(getPerimeter())
            + ", height: " + Double.toString(height)
            + ", width: " + Double.toString(width)
            + ", color: " + color
        );
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
