package core.basesyntax;

class RightTriangle extends Figure {
    double firstLeg, secondLeg;

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
        System.out.println("Figure: triangle, area: "
                + getArea() + " sq. units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg
                + " units, color: " + color);
    }
}
