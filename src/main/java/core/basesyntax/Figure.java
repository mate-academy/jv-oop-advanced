package core.basesyntax;

public abstract class Figure implements FigureArea {
    protected String color;

    public Figure() {
        ColorSupplier color = new ColorSupplier();
        this.color = color.getRandomColor();
    }

    abstract String getFigureInfo();
}
