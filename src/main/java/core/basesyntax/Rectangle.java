package core.basesyntax;

public class Rectangle implements Figure {
    private double width;
    private double height;
    private String color;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return height * width ;
    }

    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, width: " + width + " height " + height + " units, color: " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
