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
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void Draw() {
        System.out.println("Figure: RigtTriangle {" + "firstLeg: " + firstLeg + " units"
                + ", secondLeg: " + secondLeg + " units" + ", color: " + getColor()
                + ", area: " + getArea() + " sq.units" + '}');
    }
}
