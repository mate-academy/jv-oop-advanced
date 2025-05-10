package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final int high;

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg, int high) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.high = high;
    }

    @Override
    public int getArea() {
        return ((firstLeg + secondLeg) / 2) * high;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid's firstLeg is " + firstLeg
                + "; secondLeg is " + secondLeg
                + "; high is " + high
                + "; area is " + getArea()
                + "; color is " + getColor());
    }
}
