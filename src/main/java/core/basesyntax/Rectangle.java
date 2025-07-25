package core.basesyntax;

public class Rectangle implements Figure {
    private String color;
    private double width;
    private double length;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("figure: rectangle, " + "area: "
                + String.format("%.2f", getArea()) + " sq. units, "
                + "length: " + length + " units, " + "width: " + width + " units, "
                + "color: " + color);

    }
}
