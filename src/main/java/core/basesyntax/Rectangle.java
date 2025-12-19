package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.height = length;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + width
                + " units, color: " + getColor());
    }

}
