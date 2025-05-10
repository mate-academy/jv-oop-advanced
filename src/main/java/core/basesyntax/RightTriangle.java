package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {

        return firstLeg;
    }

    public double getSecondLeg() {

        return secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * getFirstLeg() * getSecondLeg();
    }

    @Override
    public void draw() {
        System.out.println(String.format("RightTriangle with area: %.2f sq. units, "
                + "firstLeg: %.2f units, "
                + "kat2: %.2f units, color: %s",
                getArea(), getFirstLeg(), getSecondLeg(), getColor()));
    }
}

