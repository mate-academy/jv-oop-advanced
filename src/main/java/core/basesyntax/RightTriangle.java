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
    public void draw() {
        System.out.println("Figure: right triangle, area: " + area() + " sq.units, " +
                "firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units, " +
                "color: " + getColor());
    }

    @Override
    public double area() {
        return firstLeg * secondLeg / 2.0;
    }
}
