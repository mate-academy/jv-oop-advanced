package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(double radius, double area, String color) {
        super(color, area);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("circle, " + "area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, " + "color: " + getColor());
    }
}
