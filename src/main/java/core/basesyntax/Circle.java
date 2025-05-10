package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void calculateSquare() {
        System.out.println("Square circle = " + Math.PI * radius * radius);
    }

    @Override
    String getInfo() {
        return "Figure: Circle, area: " + Math.PI * radius * radius
                + " sq.units, radius: " + radius + " units, color: " + getColor();
    }
}
