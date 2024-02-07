package core.basesyntax.shapes;

public class Rectangle extends Shape {
    private double base;
    private double height;

    public Rectangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base * height;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder("Figure: ");
        String separator = ", ";
        sb.append(getClass().getSimpleName()).append(separator).append("area: ").append(area())
                .append(" sq.units").append(separator).append("base: ").append(base)
                .append(" units").append(separator).append("height: ").append(height)
                .append(" units").append(separator).append("color: ").append(getColor());
        System.out.println(sb);
    }
}
