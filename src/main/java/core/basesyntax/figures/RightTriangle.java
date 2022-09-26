package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    public static final int BOUND = 100;
    private int firstLeg;
    private int secondLeg;

    @Override
    public void setRandomProperties() {
        super.setRandomProperties();
        this.firstLeg = random.nextInt(BOUND);
        this.secondLeg = random.nextInt(BOUND);
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String toString() {
        return "Figure: right triangle, area: " + getArea()
                + " sq.units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg
                + " units, color: " + getColor();

    }
}
