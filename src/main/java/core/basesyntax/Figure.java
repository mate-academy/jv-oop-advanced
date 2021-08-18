package core.basesyntax;

public abstract class Figure implements FigureDrawer, AreaCalculator {
    protected final String color;

    Figure(String color) {
        this.color = color;
    }
}
