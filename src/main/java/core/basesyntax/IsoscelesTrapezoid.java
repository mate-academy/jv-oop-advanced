package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(double topBase, double bottomBase, String color) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.color = color;
    }

    @Override
    public void draw() {
        info.append("Figure: Isosceles Trapezoid, area: ")
                .append(getArea())
                .append(" sq.units, top base: ")
                .append(topBase)
                .append(" units, bottom base: ")
                .append(bottomBase)
                .append(" units, height: ")
                .append(height)
                .append(" units, color: ")
                .append(color);
        System.out.println(info.toString());
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) / 2 * height;
    }
}
