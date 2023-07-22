package core.basesyntax;

public class Circle extends Figure {
    private String color;
    private double radius;

    public Circle() {

    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: circle, area: ").append(calculateArea());
        builder.append(" sq.units, radius: ").append(radius);
        builder.append(" units, color: ").append(color);
        System.out.println(builder);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
