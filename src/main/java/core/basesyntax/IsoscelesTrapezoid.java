package core.basesyntax;
class IsoscelesTrapezoid extends AbstractFigure {
    private final double longerBase;
    private final double shorterBase;
    private final double height;

    public IsoscelesTrapezoid(double baseA, double baseB, double height, String color) {
        super(color);
        this.longerBase = Math.max(baseA, baseB);
        this.shorterBase = Math.min(baseA, baseB);
        this.height = height;
    }

    @Override
    public double getArea() {
        return (longerBase + shorterBase) / 2.0 * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %.1f sq. units,"
                        + " bases: %.1f & %.1f units, "
                        + "height: %.1f units, color: %s%n",
                getArea(), longerBase, shorterBase, height, getColor());
    }
}
