package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getName() + ",  area: " + getArea() + "sq.units"
                + "  firstLeg: " + firstLeg + "units" + "  secondLeg: " + secondLeg
                + "units" + "  color: " + getColor());
    }
}
