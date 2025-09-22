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
    public double area() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + area()
                + " sq. units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg
                + " units, color: " + getColor());
    }
}
