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
                + String.format("%.2f",this.getArea()) + " sq.units,"
                + " width: " + String.format("%.2f",this.width)
                + " units, height: " + String.format("%.2f", this.height)
                + " units, color: " + this.color);
    }
}
