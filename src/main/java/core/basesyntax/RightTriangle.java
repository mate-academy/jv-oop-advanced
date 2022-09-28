package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, firstLeg: "
                + getFirstLeg() + " units, secondLeg: " + getSecondLeg() + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        double area = firstLeg * secondLeg / 2;
        return Math.ceil(area * 10) / 10;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }
}
