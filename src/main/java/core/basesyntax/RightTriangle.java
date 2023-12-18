package core.basesyntax;

class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String getName() {
        return "right triangle";
    }

    @Override
    public String draw() {
        return "first leg: " + firstLeg + " unit, second leg: "
                + secondLeg + " unit, " + "color: " + getColor();
    }
}
