package core.basesyntax;

public class Rectangle extends Figure {
    private float sideA;
    private float sideB;

    public Rectangle(float sideA, float sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: rectangle, area: %.2f sq.units, sideA: %.2f units,"
                + " sideB: %.2f units, color: %s\n",
                getArea(), sideA, sideB, getColor());
    }
}
