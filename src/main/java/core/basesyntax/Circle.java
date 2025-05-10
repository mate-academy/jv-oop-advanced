package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.round(radius * radius * Math.PI);
    }

    @Override
    public void draw() {
        System.out.println("FIGURES: circle, area: " + calculateArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }
}
