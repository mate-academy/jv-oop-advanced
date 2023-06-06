package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    RightTriangle() {
        firstLeg = random.nextInt(NUMBER);
        secondLeg = random.nextInt(NUMBER);
        setArea(getArea());
        setColor(colorSupplier.getRandomColor());
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, firstLeg: %.1f units,"
                        + "secondLeg: %.1f units, color: %s%n",
                getClass().getSimpleName().toLowerCase(),
                getArea(), firstLeg, secondLeg, getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
