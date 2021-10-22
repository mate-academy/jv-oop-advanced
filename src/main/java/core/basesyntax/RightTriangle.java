package core.basesyntax;

public class RightTriangle extends Figure {
    private float firstLeg;
    private float secondLeg;

    public RightTriangle(float firstLeg, float secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public float area() {
        return firstLeg * secondLeg / 2;
    }

    public String draw() {
        return "Figure: right triangle, area: " + area()
                + " sq.units, firstLeg: " + firstLeg
                + " sq.units, secondLeg: " + secondLeg
                + " units, color: " + getColor();
    }
}
