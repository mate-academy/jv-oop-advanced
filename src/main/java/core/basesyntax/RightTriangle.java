package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String name, String color, int sideA, int sideB) {
        super(name, color);
        this.firstLeg = sideA;
        this.secondLeg = sideB;
    }

    @Override
    public double getArea() {
        return this.firstLeg * this.secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %1.1f sq. units, sideA: %d units,"
                        + " sideB: %d units, color: %s\n",
                getName(), getArea(), firstLeg, secondLeg, getColor());
    }
}
