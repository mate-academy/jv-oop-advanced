package core.basesyntax;

public class RightTriangle extends Figure implements AreaFigure, DrawFigure {
    private float firstLeg = 5;
    private float secondLeg = 4;

    public RightTriangle() {
    }

    public RightTriangle(float firstLeg, float secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public float area() {
        return firstLeg * secondLeg / 2;
    }

    public String toString() {
        return "Figure: right triangle, area: " + area()
                + " sq.units, firstLeg: " + firstLeg
                + " sq.units, secondLeg: " + secondLeg
                + " units, color: " + getColor();
    }
}
