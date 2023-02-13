package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private double area;

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
        System.out.println("Figure: circle, area: " + calculateArea()
                + " sq.units, side: " + radius + "units, color: " + getColor());
    }
}
