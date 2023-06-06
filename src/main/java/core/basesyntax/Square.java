package core.basesyntax;

public class Square extends Figure {
    private int side;

    Square() {
        side = random.nextInt(NUMBER);
        setArea(getArea());
        setColor(colorSupplier.getRandomColor());
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, side: %d units, color: %s%n",
                getClass().getSimpleName().toLowerCase(), getArea(), side, getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
