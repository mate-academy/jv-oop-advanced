package core.basesyntax.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder("Figure: ");
        String separator = ", ";
        sb.append(getClass().getSimpleName()).append(separator).append("area: ").append(area())
                .append(" sq.units").append(separator).append("radius: ").append(radius)
                .append(" units").append(separator).append("color: ").append(getColor());
        System.out.println(sb);
    }
}
