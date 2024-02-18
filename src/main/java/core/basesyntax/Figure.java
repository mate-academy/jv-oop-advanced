package core.basesyntax;

public abstract class Figure implements FigureDrawer, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
