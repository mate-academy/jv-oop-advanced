package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private int height;

    IsoscelesTrapezoid() {
        firstSide = random.nextInt(NUMBER);
        secondSide = random.nextInt(NUMBER);
        height = random.nextInt(NUMBER);
        setArea(getArea());
        setColor(colorSupplier.getRandomColor());
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, firstSide: %.1f units,"
                        + "secondSide: %.1f units, height: %d units, color: %s%n",
                getClass().getSimpleName().toLowerCase(),
                getArea(), firstSide, secondSide, height, getColor());
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }
}
