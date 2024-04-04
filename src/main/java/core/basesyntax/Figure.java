package core.basesyntax;

public abstract class Figure implements FigureInfo, CalculatableArea {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    protected Color color;

    public Figure() {
        this.color = Color.valueOf(colorSupplier.getRandomColor());
    }

    public Figure(Color color) {
        this.color = color;
    }
}
