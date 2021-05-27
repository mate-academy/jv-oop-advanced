package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height, String name, String color) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", getArea: "
                + getArea() + " sq. units, width: " + width + " sq. units, height: "
                + height + " units: color " + getColor());
    }
}
