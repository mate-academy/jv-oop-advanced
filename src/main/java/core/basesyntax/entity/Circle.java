package core.basesyntax.entity;

public class Circle extends Figure implements Printer {
    public final static int MAX_RADIUS = 25;
    public final static int DEFAULT_RADIUS = 25;
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void printInfo() {
        System.out.println(new StringBuilder("Figure:")
                .append(" Circle, area: ")
                .append(Math.PI * radius * radius)
                .append(" sq.units,")
                .append(" radius: ")
                .append(radius)
                .append(" units, color: ")
                .append(getColor()));
    }
}
