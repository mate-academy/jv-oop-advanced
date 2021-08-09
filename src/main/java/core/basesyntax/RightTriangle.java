package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
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
    public void draw() {
        System.out.println("Figure: right triangle, area: " + String.format("%.1f", getArea())
                + " sq.units, first leg: " + getFirstLeg()
                + " units, secondLeg: " + getSecondLeg()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (double) getFirstLeg() * getSecondLeg() / 2;
    }
}
