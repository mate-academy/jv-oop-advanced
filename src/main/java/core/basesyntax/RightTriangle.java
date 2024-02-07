package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: " + calculateArea() + " units, firstLeg "
                + firstLeg + " units, secondLeg " + secondLeg + " units, color: " + getColor());
    }
}
