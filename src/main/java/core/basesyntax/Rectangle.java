package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    Rectangle() {
        firstSide = random.nextInt(NUMBER);
        secondSide = random.nextInt(NUMBER);
        setArea(getArea());
        setColor(colorSupplier.getRandomColor());
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units,"
                        + "firstSide: %d units, secondSide: %d units, color: %s%n",
                getClass().getSimpleName().toLowerCase(),
                getArea(), firstSide, secondSide, getColor());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
