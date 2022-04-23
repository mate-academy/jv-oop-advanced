package core.basesyntax;

public class Figure {
    String color;
    public Figure() {
        ColorSupplier cc = new ColorSupplier();
        this.color = cc.getRandomColor();
    }
}
