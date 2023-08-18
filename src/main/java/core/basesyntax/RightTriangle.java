package core.basesyntax;

public class RightTriangle extends Figure {
    private static final int TWO = 2;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / TWO;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: " + getArea() +
                " sq.units, first leg: " + firstLeg + ", second leg: " + secondLeg +
                ", color: " + getColor());
    }
}
