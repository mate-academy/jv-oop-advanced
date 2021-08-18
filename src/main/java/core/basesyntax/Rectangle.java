package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        super.setType("Rectangle");
        super.setColor(color);
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    public void info() {
        System.out.printf("Figure: %s, area: %s sq.units, sideA: %s units, sideB: %s units,"
                        + " color: %s%n", getType(), area(), sideA, sideB, getColor());
    }
}
