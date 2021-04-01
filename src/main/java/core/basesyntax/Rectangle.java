package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(String name, String color, int sideA, int sideB) {
        super(name, color);
        this.width = sideA;
        this.length = sideB;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %1.1f sq. units, sideA: %d units, "
                        + "sideB: %d units, color: %s\n",
                getName(), getArea(), width, length, getColor());
    }
}
