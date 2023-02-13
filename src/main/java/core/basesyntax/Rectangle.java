package core.basesyntax;

public class Rectangle extends Figure {
    public static final double MAX_HEIGHT = 100;
    public static final double MAX_WIDTH = 100;
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
                + ", color: " + color);
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
        if (height > 0 && height < MAX_HEIGHT) {
            this.height = height;
        } else if (height < 0) {
            throw new RuntimeException("Height may be more than 0!");
        } else {
            throw new RuntimeException("Height may be less than "
                    + Double.toString(MAX_HEIGHT) + "!");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0 && width < MAX_WIDTH) {
            this.width = width;
        } else if (width <= 0) {
            throw new RuntimeException("Width may be more than 0!");
        } else {
            throw new RuntimeException("Width may be less than "
                    + Double.toString(MAX_WIDTH) + "!");
        }
    }
}
