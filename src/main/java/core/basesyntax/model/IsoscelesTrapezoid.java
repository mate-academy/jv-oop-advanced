package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int topBase;
    private final int downBase;

    public IsoscelesTrapezoid(int height, int topBase, int downBase, String color) {
        super.setColor(color);
        this.height = height;
        this.topBase = topBase;
        this.downBase = downBase;
    }

    @Override
    public double getArea() {
        return ((double)topBase + downBase) / 2 * height;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append("Figure: isosceles trapezoid, area: ")
                .append(String.format("%.1f", getArea()))
                .append(" sq.units, height: ")
                .append(height).append(" units, topBase ").append(topBase)
                .append(" units, downBase ").append(downBase)
                .append(" units, color: ")
                .append(super.getColor().toLowerCase()));
    }
}
