package core.basesyntax;

public class RigthTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RigthTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return Math.round((firstLeg * secondLeg) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + Double.toString(getArea())
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor().toLowerCase());
    }
}
