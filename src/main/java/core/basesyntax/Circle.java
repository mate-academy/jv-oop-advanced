package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + String.format("%.2f", calculateArea())
                + " sq.units, radius: " + radius + " units, color: " + getColor().name());
    }
}
