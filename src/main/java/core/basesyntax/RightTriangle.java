package core.basesyntax;

public class RightTriangle extends Figure {
    private static final int DIVISION_NUMBER = 2;
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / DIVISION_NUMBER;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, first leg: "
                + firstLeg + " units, second leg: " + secondLeg + " units, color: " + color);
    }
}
