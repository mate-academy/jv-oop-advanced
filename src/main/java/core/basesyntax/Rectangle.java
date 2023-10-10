package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color, 0);
        this.width = width;
        this.height = height;
        this.setArea(getArea());
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, width " + width
                + " units, height " + height
                + " units, color: " + getColor());
    }
}
