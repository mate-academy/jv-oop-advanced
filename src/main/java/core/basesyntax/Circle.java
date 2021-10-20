package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private double radius;

    public Circle(String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return Math.round(area * 10) / 10D;
    }

    @Override
    public String draw() {
        return "Figure: " + getName().toLowerCase() + ", area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor();
    }
}
