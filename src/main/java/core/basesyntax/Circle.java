package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        double circleArea;
        circleArea = Math.PI * radius * radius;
        circleArea = Math.round(circleArea * 100.0) / 100.0;
        return circleArea;
    }

    public void draw() {
        System.out.println("Figure: Circle, " + "area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, " + "color: " + getColor());
    }
}
