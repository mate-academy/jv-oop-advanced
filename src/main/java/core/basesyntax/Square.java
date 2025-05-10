package core.basesyntax;

public class Square extends Figure {
    private float sideA;

    public Square(String color, float sideA) {
        super(color);
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: isosceles trapezoid, area: %.2f sq.units,"
                + " sideA: %.2f units, color: %s\n",
                getArea(), sideA, getColor());
    }
}
