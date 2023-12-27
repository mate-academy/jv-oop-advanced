package core.basesyntax;

class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, ColorSupplier.Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setName("right triangle");
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        String figureDetails = "first leg: "
                + firstLeg + " unit, second leg: " + secondLeg
                + " unit, " + "color: " + getColor();

        // include additional information for draw()
        return super.draw() + "\n" + figureDetails;
    }
}
