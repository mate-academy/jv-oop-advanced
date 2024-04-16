package core.basesyntax;

public abstract class IsoscelesTrapezoid extends AbstractFigure {
    private final String color;
    private final double upperBase;
    private final double lowerBase;
    private final double height;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double height, Color color) {
        super();
        this.color = String.valueOf(color);
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
        System.out.println(getArea() + upperBase + lowerBase + height + color);
    }
}
