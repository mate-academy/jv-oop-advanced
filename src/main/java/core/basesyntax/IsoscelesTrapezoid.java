package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private final double upperBase;
    private final double lowerBase;
    private final double height;

    public IsoscelesTrapezoid(Color color, double upperBase, double lowerBase, double height) {
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
        System.out.println(getArea() + ", Upper Base: " + upperBase
                + ", Lower Base: " + lowerBase + ", Height: "
                + height + ", Color: " + color);
    }
}
