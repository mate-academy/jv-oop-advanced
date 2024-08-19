package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void drawArea() {
        double area = Math.PI * (this.radius * this.radius);

        System.out.println("Figure: circle, " + "area: " + area + " sq. units, radius: "
                + this.radius + " units, color: " + this.getColor());
    }
}
