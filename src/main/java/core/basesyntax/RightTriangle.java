package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea()
                + " sq.units, first leg: " + firstLeg + " units, second leg: " + secondLeg
                + " units, color: " + getColor());
    }
}
