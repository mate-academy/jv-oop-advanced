package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String name, String color, int sideA, int sideB) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int areaCalculate() {
        return this.sideA * this.sideB;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %d sq. units, sideA: %d units, "
                        + "sideB: %d units, color: %s\n",
                getName(), areaCalculate(), sideA, sideB, getColor());
    }
}
