package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String printInfo() {
        return "Figure: cirle, area: " + Math.floor(getArea() * 100) / 100
                + " sq.units, radius: " + (int) getRadius() + " units, color: " + getColor();
    }
}
