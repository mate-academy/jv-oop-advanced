package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = 3.14;
    private final int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    private double calculateAndSetArea() {
        return PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: Circle, area: " + calculateAndSetArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor();
    }
}
