package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double areaInfo() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: right triangle, area: "
                + areaInfo() + " sq.units, firstLeg: "
                + getFirstLeg() + " units, secondLeg: "
                + getSecondLeg() + " units, color: "
                + getColor());
    }
}
