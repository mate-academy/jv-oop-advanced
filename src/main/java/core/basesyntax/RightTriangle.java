package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: right rectangle, area: " + calculateArea()
                + " sq. units, firstLeg: " + firstLeg + " sq. units, secondLeg: " + secondLeg
                + "units, color: " + getColor()));
    }
}
