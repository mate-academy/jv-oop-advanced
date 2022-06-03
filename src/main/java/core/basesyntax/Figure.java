package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected Color color = new ColorSupplier().getRandomColor();

}
