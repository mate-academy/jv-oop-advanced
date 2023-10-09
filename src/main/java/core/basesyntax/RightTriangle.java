package core.basesyntax;

class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final String color;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        int intFirstLeg = (int) firstLeg;
        int intSecondLeg = (int) secondLeg;
        System.out.println("Figure: triangle, area: " + getArea() + " sq.units, firstLeg: "
                + intFirstLeg + " units, secondLeg: " + intSecondLeg + " units, color: " + color);
    }
}

