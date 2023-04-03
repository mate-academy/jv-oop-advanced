package core.basesyntax;

public abstract class Figure implements AreaCalculate, Drawable {

    protected String color;
    private int height;
    private int width;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final FigureSupplier figureSupplier = new FigureSupplier();

    public Figure() {
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
