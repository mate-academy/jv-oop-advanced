package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void drawInfo() {
        System.out.print("Figure: circle, area: ");
        System.out.printf("%.1f", getArea());
        System.out.println(" sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
