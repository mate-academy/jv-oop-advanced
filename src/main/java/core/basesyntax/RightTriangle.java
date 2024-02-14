package core.basesyntax;

class RightTriangle extends ColorsOfFigures {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void getToDraw() {
        System.out.println("firstLeg: " + firstLeg + ", secondLeg: " + secondLeg);
    }
}
