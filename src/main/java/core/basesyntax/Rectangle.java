package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
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
        return (width + height) * 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, width: " + width
                + " units, height: " + height + " units, area: "
                + getArea() + " sq. units, color: " + getColor());
    }
}
