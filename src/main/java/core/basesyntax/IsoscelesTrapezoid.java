package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final double thirdLeg;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, double thirdLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.thirdLeg = thirdLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2 * thirdLeg;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq. units, firstLeg: " + firstLeg + "  sq. units, secondLeg: "
                + secondLeg + " sq. units, secondLeg: "
                + thirdLeg + "units, color: " + getColor()));
    }
}
