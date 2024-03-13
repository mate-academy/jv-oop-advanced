package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.round((radius * radius * Math.PI) * 10) / 10.0;
    }
    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: circle, area: ")
                .append(getArea())
                .append(" sq. units, radius: ")
                .append(radius)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(builder);
    }
}
