package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void print() {
        System.out.println(
                new StringBuilder("Figure: circle, area: ")
                .append(String.format("%.1f", getArea()))
                .append(" sq.units, radius: ")
                .append(radius)
                .append(" units, color: ")
                .append(super.getColor().toLowerCase())
                .toString()
        );
    }
}
