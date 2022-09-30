package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator {
    private double firstSide;
    private double secondSide;

    public RightTriangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area, " + getArea() + " sq.units, firstSide: "
                + firstSide + " units, secondSide: " + secondSide + " units, color: "
                + getColor().toLowerCase();
    }
}
