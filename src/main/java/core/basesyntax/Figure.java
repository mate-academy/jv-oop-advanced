package core.basesyntax;

public abstract class Figure implements FiguresCalculations, FiguresDrawers {
    protected String color;

    public Figure() {
        this.color = new ColorSupplier().getRandomColor();
    }

    public Figure(String defaultColor) {
        this.color = defaultColor;
    }

    public String getColor() {
        return color;
    }
}
