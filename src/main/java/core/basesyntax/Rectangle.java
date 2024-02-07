package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void drawTheFigure() {
        System.out.printf("Figure: rectangle, area: %.1f sq.units,"
                        + " sideA: %d units, sideB: %d units, color: %s%n",
                calculateArea(), sideA, sideB, getColor().toLowerCase());
    }
}
