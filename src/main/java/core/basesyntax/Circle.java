package core.basesyntax;

public class Circle extends Figure {
    public static final double PI = 3.14159265358979323846;
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Circle, area: "
                + String.format("%.2f", this.getArea()) + " sq. units, radius: "
                + radius + " units, color: " + this.getColor());
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
