package core.basesyntax;

public abstract class Figure implements FiguresCalculations, FiguresDrawers {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
