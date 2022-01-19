package core.basesyntax;

public class Figure {
    ColorSupplier colorSupplier = new ColorSupplier();
    private String color = colorSupplier.getRandomColor();

}
