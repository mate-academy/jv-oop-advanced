package core.basesyntax;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %,.2f sq.units, side a: %d units, "
                + "side b: %d units, color: %s%n",
                        calculateArea(), sideA, sideB, color.name());
    }
}
