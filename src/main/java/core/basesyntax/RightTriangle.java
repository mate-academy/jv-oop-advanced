package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String draw() {
        return "Figure: rightTriangle, Square: " + getArea()
                + " sq.units, Height: " + firstLeg
                + " sq.units, Base: " + secondLeg
                + " units, Color: " + getColor();
    }
}
