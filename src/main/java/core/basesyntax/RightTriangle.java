package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = firstLeg;
        setColor(color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, area: " + getArea()
                + " sq.units, firstLag: " + firstLeg + " units, secondLag: "
                + secondLeg + " units, color: " + getColor());
    }
}
