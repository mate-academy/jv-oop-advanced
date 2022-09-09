package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        this.setColor(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        double area;
        area = this.length * this.width;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + String.format("%.1f", this.getArea())
                + " sq.units, length: " + String.format("%.1f", length)
                + " units, width: " + String.format("%.1f", width)
                + " units, color: " + this.getColor());
    }
}
