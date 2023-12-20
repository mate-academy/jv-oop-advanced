package core.basesyntax.figure;

public abstract class Figure implements FigureOption {
    Color color = new ColorSupplier().getRandomColor();
    FigureName figureName;
}
