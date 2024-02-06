package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + String.format("%.1f", this.getArea())
                + " sq.units, radius: " + this.radius
                + " units, color: " + this.color.toString().toLowerCase());
    }
}
