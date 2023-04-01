package core.basesyntax;

public interface FigureColor {
    default String getColor() {
        return new ColorSupplier().getRandomColor();
    }
}
