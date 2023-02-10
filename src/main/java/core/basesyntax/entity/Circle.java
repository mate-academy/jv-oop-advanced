package core.basesyntax.entity;

public class Circle extends Figure {
    public static final double MAX_RADIUS = 25;
    public static final double DEFAULT_RADIUS = 10;
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void printInfo() {
        System.out.println(new StringBuilder("Figure:")
                .append(" Circle, \n        area: ")
                .append(getArea())
                .append(" sq.units,")
                .append("\n        radius: ")
                .append(radius)
                .append(" units, \n        color: ")
                .append(getColor()));
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
