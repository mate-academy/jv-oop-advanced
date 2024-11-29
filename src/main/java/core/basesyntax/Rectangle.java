package core.basesyntax;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(Colors.valueOf(color));
        this.height = Math.round(Math.abs(height));
        this.width = Math.round(Math.abs(width));

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

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Shape: square, area: " + calculateArea()
                + ", height: " + getHeight()
                + ", width: " + getWidth()
                + ", color: " + getColor());
    }
}
