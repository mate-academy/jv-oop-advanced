package core.basesyntax;

class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super("right triangle", color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public long draw() {
        String figureDetails = "first leg: "
                + firstLeg + " unit, second leg: " + secondLeg
                + " unit, " + "color: " + getColor();

        System.out.println(super.draw());
        System.out.println(figureDetails);
        return 0;
    }
}
