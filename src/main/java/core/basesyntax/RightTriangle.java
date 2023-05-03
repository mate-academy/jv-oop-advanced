package core.basesyntax;

class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " first leg: " + firstLeg
                + " second leg: " + secondLeg
                + " color: " + getColor());
    }
}
