package core.basesyntax;

class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(RightTriangle.class.getSimpleName(), color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        String figureDetails = "first leg: "
                + firstLeg + " unit, second leg: " + secondLeg
                + " unit, " + "color: " + getColor();

        super.draw();
        System.out.println("figure: " + getName() + ", square: "
                + calculateArea() + " sq.units.");
        System.out.println(figureDetails);
    }
}
