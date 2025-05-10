package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    @Override
    public double calculateArea() {
        return ((firstLeg * secondLeg) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + calculateArea() + " sq. units, first leg: "
                + firstLeg + " units, second leg: "
                + secondLeg + " units, color: "
                + getColor());
    }
}
