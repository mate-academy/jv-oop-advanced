package core.basesyntax;

public abstract class Figure implements GetFigureArea, DrawFigure {
    protected Color color;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure() {
        this.color = colorSupplier.getRandomColor();
    }
}
