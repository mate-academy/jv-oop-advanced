package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public void draw() {
        System.out.println("\nFigure: Circle, "
                + "area: "
                + String.format("%.2f", getArea())
                + " units, side: "
                + radius
                + " units,"
                + " color: "
                + getColor());
    }
}
