package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstSide;
    private double secondSide;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstSide = firstLeg;
        this.secondSide = secondLeg;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: " + getArea() + " sq.units, first leg: "
                + firstSide + " units, second leg:" + secondSide + " units, color: " + getColor());
    }
}
