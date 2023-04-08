package core.basesyntax;

public abstract class Figure implements AreaCalculation, Draw {

    public String getColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }
}
