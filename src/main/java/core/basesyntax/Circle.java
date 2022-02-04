package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder()
                .append("Figure: circle, area: ")
                .append(String.format("%.1f", area()))
                .append(" sq.units, radius: ")
                .append(String.format("%.1f", radius))
                .append(" units, color: ")
                .append(color).toString());
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
