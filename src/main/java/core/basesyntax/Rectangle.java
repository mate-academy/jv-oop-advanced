package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + String.format("%.2f", getArea()) + " sq.units,"
                + " width: " + String.format("%.2f", width)
                + " units, height: " + String.format("%.2f", height)
                + " units, color: " + color);
    }
}
