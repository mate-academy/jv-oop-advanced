package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable, FigureRandomizer {
    protected ColorSupplier colorSupplier = new ColorSupplier();
    protected FigureSupplier figureSupplier = new FigureSupplier();
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
