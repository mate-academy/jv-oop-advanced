package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle() {
    }

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("right triangle, " + "area: " + calculateArea()
                + " sq.units, " + "first leg: " + firstLeg + " units, " + "second leg: "
                + secondLeg + " units," + " color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }
}
