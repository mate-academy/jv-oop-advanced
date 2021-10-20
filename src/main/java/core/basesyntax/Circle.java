package core.basesyntax;

public class Circle extends Figure  implements AreaCalculator, Printer {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String printInfo() {
        return "Figure: circle, "
                + "area: " + calculateArea() + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor();
    }
}
