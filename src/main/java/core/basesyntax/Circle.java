package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea()
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        final int powIndex = 2;
        return Math.PI * Math.pow(radius, powIndex);
    }
}
