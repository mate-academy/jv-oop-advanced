package core.basesyntax;

public class RightTriangle extends Properties {
    private final int firstLeg = 6;
    private final int secondLeg = 8;

    @Override
    public double obtainArea() {
        return (firstLeg * secondLeg) / 2.0;

    }

    @Override
    public void drawFigure() {
        System.out.println("RightTriangle, area: " + obtainArea()
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor());
    }

}
