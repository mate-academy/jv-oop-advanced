package core.basesyntax;

class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public double obtain() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + obtain()
                + " sq. units, firstLeg: "
                + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + color);
    }
}
