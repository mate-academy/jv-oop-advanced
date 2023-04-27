package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    RightTriangle(String color, int firstLeg, int secondLeg) {
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
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: "
                + getArea()
                + " sq.units, first leg: "
                + getFirstLeg()
                + " units, second leg: "
                + getSecondLeg()
                + " units, color: "
                + getColor().toLowerCase());
    }
}