package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: circle, area: ")
                .append(getArea())
                .append(" sq.units, side: ")
                .append(radius)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
