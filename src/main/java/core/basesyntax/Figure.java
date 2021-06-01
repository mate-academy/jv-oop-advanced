package core.basesyntax;

public abstract class Figure {
    ColorSupplier colorSupplier = new ColorSupplier();
    String color = colorSupplier.getRandomColor();
    double square;

}
