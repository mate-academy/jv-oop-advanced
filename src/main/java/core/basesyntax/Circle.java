package core.basesyntax;

public class Circle extends Figure {

    public Circle(String color, double radius) {
        super(color, radius);
    }

    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units,"
                + " radius: " + sideOrRadius + " units,"
                + " color: " + color);
    }

    @Override
    public double getArea() {
        return Math.PI * sideOrRadius * sideOrRadius;
    }
}
