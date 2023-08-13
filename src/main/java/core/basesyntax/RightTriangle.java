package core.basesyntax;

class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s right triangle, first side: %.2f, "
                        + "second side: %.2f, area: %.2f",
                this.color, this.firstLeg, this.secondLeg, this.getArea()));
    }
}
