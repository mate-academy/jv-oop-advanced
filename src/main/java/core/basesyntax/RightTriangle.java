package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2.0;
    }

    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " sq. units, first leg: " + firstLeg + "units, second leg: " + secondLeg
                + " units, color: " + color);
    }
}
