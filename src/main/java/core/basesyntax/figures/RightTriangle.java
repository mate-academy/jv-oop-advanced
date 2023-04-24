package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
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
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String draw() {
        return "Figure: Right Triangle, area: "
                + getArea() + " sq.units, firsLeg: "
                + getFirstLeg() + " units, secondLeg: "
                + getSecondLeg() + " units, color: "
                + getColor();
    }
}
