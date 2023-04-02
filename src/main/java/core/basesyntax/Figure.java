package core.basesyntax;

public abstract class Figure implements AreaCalculate, Drawable {
    private int height;
    private int width;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final FigureSupplier figureSupplier = new FigureSupplier();

    protected Figure() {

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }
}
