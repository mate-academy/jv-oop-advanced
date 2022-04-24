package core.basesyntax;

public abstract class Figure {
    String color;
    public Figure() {
        ColorSupplier cc = new ColorSupplier();
        this.color = cc.getRandomColor();
    }
    abstract String getFigureInfo();
}
