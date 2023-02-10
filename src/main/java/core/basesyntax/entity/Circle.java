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
                .append(" Circle,")
                .append(System.lineSeparator())
                .append("        area: ")
                .append(getArea())
                .append(" sq.units,")
                .append(System.lineSeparator())
                .append("        radius: ")
                .append(radius)
                .append(" units,")
                .append(System.lineSeparator())
                .append("        color: ")
                .append(getColor()));
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
