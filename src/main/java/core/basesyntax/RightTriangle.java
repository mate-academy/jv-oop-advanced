package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg
                + " uints, secondLeg: " + secondLeg
                + " units, color: " + getColor().name());
    }
}
