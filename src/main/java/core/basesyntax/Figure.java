package core.basesyntax;

abstract class Figure implements Behaviour, DrawFigure {
    public String color() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }
}
