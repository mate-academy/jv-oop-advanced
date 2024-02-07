package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Color color, int secondLeg, int firstLeg) {
        super(color);
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg >> 1;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: right triangle, area:  "
                + getArea() + " sq.units, firstLeg: "
                + firstLeg + " ,units, secondLeg: "
                + secondLeg + " units, color: " + getColor());
    }
}

