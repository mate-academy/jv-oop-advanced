package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private final double upperBase;
    private final double lowerBase;
    private final double height;
    private final String color;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double height, String color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * height;
    }

    @Override
    public void draw() {
        int intUpperBase = (int) upperBase;
        int intLowerBase = (int) lowerBase;
        int intHeight = (int) height;
        System.out.println("Figure: trapezoid, area: " + getArea() + " sq.units, upperBase: "
                + intUpperBase + " units, lowerBase: " + intLowerBase + " units, height: "
                + intHeight + " units, color: " + color);
    }
}
