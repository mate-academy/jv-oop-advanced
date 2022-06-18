package core.basesyntax;

public class Circle extends Figures {
    private final double radius;

    public Circle(double radius, String color) {
        this.setColor(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "circle, area: " + area() + " sq.units, radius: "
                + radius + " units, color: " + getColor();
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
