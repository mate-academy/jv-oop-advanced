package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
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
