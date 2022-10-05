package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.print("\nType: circle"
                + "\nRadius: " + radius
                + "\nColor: " + color
                + "\n-----------");
    }
}
