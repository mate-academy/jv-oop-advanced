package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private final int upperBase;
    private final int lowerBase;
    private final int height;
    private final String color;

    public IsoscelesTrapezoid(int upperBase, int lowerBase, int height, String color) {
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

        System.out.println("Figure: trapezoid, area: " + getArea() + " sq.units, upperBase: "
                + upperBase + " units, lowerBase: " + lowerBase + " units, height: "
                + height + " units, color: " + color);
    }
}
