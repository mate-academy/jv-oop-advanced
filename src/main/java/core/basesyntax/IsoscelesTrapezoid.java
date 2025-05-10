package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * height;
    }

    @Override
    public String draw() {
        return ("Figure: IsoscelesTrapezoid, area: "
                + getArea()
                + " sq.units, "
                + "sideA: "
                + sideA
                + " units, "
                + "sideB: "
                + sideB
                + " units, "
                + "height: "
                + height
                + " units, "
                + "color: "
                + color);
    }
}
