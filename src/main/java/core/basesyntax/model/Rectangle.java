package core.basesyntax.model;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, width: " + (int)width + " units,"
                + " height: " + (int)height + " units,"
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
