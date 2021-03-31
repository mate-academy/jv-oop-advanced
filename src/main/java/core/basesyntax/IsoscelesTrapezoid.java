package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(String name, String color, int sideA, int sideB, int height) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %d sq. units, sideA: %d units, "
                        + "sideB: %d units, height: %d units, color: %s\n",
                getName(), areaCalculate(), sideA, sideB, height, getColor());
    }

    @Override
    public int areaCalculate() {
        return (this.sideA + this.sideB) * this.height / 2;
    }
}
