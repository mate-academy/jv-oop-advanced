import core.basesyntax.ColorSupplier;

public abstract class Figure {

    protected ColorSupplier kolor = ColorSupplier.getRandomColor();

    public abstract double getArea();

    public abstract void draw();

}
