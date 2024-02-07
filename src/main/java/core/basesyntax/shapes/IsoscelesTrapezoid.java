package core.basesyntax.shapes;

public class IsoscelesTrapezoid extends Shape {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(String color, double topSide, double bottomSide, double height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double area() {
        return (topSide + bottomSide) / 2 * height;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder("Figure: ");
        String separator = ", ";
        sb.append(getClass().getSimpleName()).append(separator).append("area: ").append(area())
                .append(" sq.units").append(separator).append("top side: ").append(topSide)
                .append(" units").append(separator).append("bottom side: ").append(bottomSide)
                .append(" units").append(separator).append("height: ").append(height)
                .append(" units").append(separator).append("color: ").append(getColor());
        System.out.println(sb);
    }
}
