package core.basesyntax.figure;

public abstract class Figure implements AreaCalculator {
    private final Color color;

    protected Figure(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure: " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq. units"
                + ", color: " + color.toString().toLowerCase();
    }
}
