package core.basesyntax;

public abstract class Figure implements CalculatableArea {
    protected Color color;
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure() {
        this.color = Color.valueOf(colorSupplier.getRandomColor());
    }

    public Figure(Color color) {
        this.color = color;
    }
}
