package core.basesyntax;

public class Rectangle extends Figure {
    private String color;
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public void draw() {
        System.out.println("Rectangle: color=" + color + ", length="
                + length + ", width=" + width + ", area=" + getArea());
    }
}
