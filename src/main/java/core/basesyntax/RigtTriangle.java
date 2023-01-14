package core.basesyntax;

public class RigtTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RigtTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = getRandom().nextInt(Max_Value);
        this.secondLeg = getRandom().nextInt(Max_Value);
    }

    @Override
    public String toString() {
        return "RigtTriangle {" +
                "firstLeg: " + firstLeg + " units" +
                ", secondLeg: " + secondLeg + " units" +
                ", color: " + color +
                ", area: " + getArea() + " sq.units" +
                '}';
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
