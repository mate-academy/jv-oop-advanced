package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String name, double topBase, double bottomBase,
                              double height, Color color) {
        super(name, color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public IsoscelesTrapezoid(double topBase, double bottomBase, double height, Color color) {
        this("IsoscelesTrapezoid", topBase, bottomBase, height, color);
    }

    @Override
    public double getArea() {
        return Math.round(0.5 * (topBase + bottomBase) * height * 100.0) / 100.0;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s, area: %.2f sq.units, "
                        + "top base: %.2f units, bottom base: %.2f units, "
                        + "height: %.2f units, color: %s",
                getName(), getArea(), topBase, bottomBase, height, getColor()));
    }
}
