package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int side1) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("\nFigure: Circle, "
                + "area: "
                + getArea()
                + " units, side: "
                + radius
                + " units,"
                + " color: "
                + getColor());
    }
}
