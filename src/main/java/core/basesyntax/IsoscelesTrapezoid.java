package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final double upperBase;
    private final double lowerBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase, double height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: IsoscelesTrapezoid, area: area: %.2f sq. units, "
                + "upperbase: %.2f units,lowerbase: %.2f units, height: %.2f units, "
                + "color: %s" + "\n", getArea(), upperBase, lowerBase, height, color);
    }
}
