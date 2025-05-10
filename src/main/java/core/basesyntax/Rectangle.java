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
        System.out.println("Figure: rectangle, area: " + calculateArea()
                + ", height: " + height
                + ", width: " + width
                + ", color: " + color);
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0 && height < MAX_HEIGHT) {
            this.height = height;
        } else {
            throw new RuntimeException("Height may be more than 0!");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0 && width < MAX_WIDTH) {
            this.width = width;
        } else {
            throw new RuntimeException("Width may be more than 0!");
        }
    }
}
