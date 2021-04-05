package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(String name, String color, int sideA, int sideB, int height) {
        super(name, color);
        this.firstBase = sideA;
        this.secondBase = sideB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %1.2f sq. units, sideA: %d units, "
                        + "sideB: %d units, height: %d units, color: %s\n",
                getName(), getArea(), firstBase, secondBase, height, getColor());
    }

    @Override
    public double getArea() {
        return (this.firstBase + this.secondBase) / 2 * this.height;
    }
}
