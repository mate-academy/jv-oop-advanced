package core.basesyntax.shapes;

public class RightTriangle extends Shape {
    private double height;
    private double base;

    public RightTriangle(String color, double height, double base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return height * base / 2;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder("Figure: ");
        String separator = ", ";
        sb.append(getClass().getSimpleName()).append(separator).append("area: ").append(area())
                .append(" sq.units").append(separator).append("height: ").append(height)
                .append(" units").append(separator).append("base: ").append(base)
                .append(" units").append(separator).append("color: ").append(getColor());
        System.out.println(sb);
    }
}
