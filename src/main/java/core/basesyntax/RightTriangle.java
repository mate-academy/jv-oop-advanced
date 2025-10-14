package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private static final double HALF = 0.5;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return HALF * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle, area: " + getArea() + " sq. units, firstLeg: "
                        + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + color
        );
    }
}
