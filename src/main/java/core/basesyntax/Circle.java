package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: circle, area: ").append(getArea())
                .append(" sq.units, radius: ").append(radius)
                .append(" units, color: ").append(color.toLowerCase());
        System.out.println(builder);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
