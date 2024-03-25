package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final double thirdLeg;

    public IsoscelesTrapezoid(Color color, double firstLeg, double secondLeg, double thirdLeg) {
        super(String.valueOf(color));
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.thirdLeg = thirdLeg;
    }

    @Override

    public double getArea() {
        return ((firstLeg * secondLeg) * thirdLeg) / 2;
    }

    @Override

    public void draw() {
        System.out.println("Figure: RightTriangle, area : " + getArea() + " sq. units, firstLeg: "
                + firstLeg + " secondLeg: "
                + secondLeg + " thirdLeg: " + thirdLeg + " units, color: " + color);
    }
}
