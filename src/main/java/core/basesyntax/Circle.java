package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder().append("Figure: Circle, area: ")
                        .append(getArea())
                        .append(" sq.units, radius: ")
                        .append(radius)
                        .append(" units, color: ")
                        .append(getColor())
        );
    }
}
