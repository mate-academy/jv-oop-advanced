package core.basesyntax;

public class Rectangle extends Figure {
    private String name = "rectangle";
    private double width;
    private double length;

    public Rectangle(double width, double length, Color color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Shape: " + name + ", area: " + String.format("%.1f", getArea())
                + " sq. units, diagonal: " + String.format("%.1f", getDiagonal())
                + " units, color: " + color);
    }
}
