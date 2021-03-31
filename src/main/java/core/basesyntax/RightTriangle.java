package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(String name, String color, int sideA, int sideB) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int areaCalculate() {
        return (int) (this.sideA * this.sideB * 0.5);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %d sq. units, sideA: %d units,"
                        + " sideB: %d units, color: %s\n",
                getName(), areaCalculate(), sideA, sideB, getColor());
    }
}
