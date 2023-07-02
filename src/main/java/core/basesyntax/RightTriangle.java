package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle area : " + getArea()
                + " first Leg : " + firstLeg + " second Leg : "
                + secondLeg + " color : " + getColor());
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }
}
