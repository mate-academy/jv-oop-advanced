package core.basesyntax;

public class Circle extends Figure {
    private String name = "circle";
    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Shape: " + name + ", area: " + String.format("%.1f", getArea())
                + " sq. units, diameter: " + String.format("%.1f", getDiameter())
                + " units, color: " + color);
    }
}
