package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle");
        System.out.println("Area: " + getArea() + " sq.units");
        System.out.println("Width: " + width + " units");
        System.out.println("Height: " + height + " units");
        System.out.println("Color: " + color);
    }
}
