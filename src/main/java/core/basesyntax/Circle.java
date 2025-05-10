package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = random.nextDouble();
    }

    @Override
    public String getData() {
        return "Figure: circle, area: " + area + " sq.units, radius: " + radius
                + " units, color: " + color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
