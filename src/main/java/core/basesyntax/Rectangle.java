package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Drawable {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            return;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            return;
        }
        this.height = height;
    }

    @Override
    public double area() {
        return this.getWidth() * this.getHeight();
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + this.area() + "sq. units, width: "
                + this.getWidth() + ", height: "
                + this.getHeight() + " ,color: " + getColor());
    }
}
