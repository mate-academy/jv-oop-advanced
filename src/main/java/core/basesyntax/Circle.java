package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + String.format("%.2f",this.getArea())
                + " sq.units, " + "radius: " + String.format("%.2f", this.radius)
                + " units, color: " + this.color);
    }
}
