package core.basesyntax.model;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, double area, String color, double radius) {
        super(name, area, color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("%s Radius: %.1f", super.toString(), radius);
    }

}
