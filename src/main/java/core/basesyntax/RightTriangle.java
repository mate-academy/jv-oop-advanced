package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = getRandom().nextInt(Max_Value);
        this.secondLeg = getRandom().nextInt(Max_Value);
    }

    @Override
    public String toString() {
        return "RigtTriangle {"
                + "firstLeg: " + firstLeg + " units"
                + ", secondLeg: " + secondLeg + " units"
                + ", color: " + getColor()
                + ", area: " + getArea() + " sq.units"
                + '}';
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
