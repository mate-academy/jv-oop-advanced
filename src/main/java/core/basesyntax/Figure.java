package core.basesyntax;

public abstract class Figure {
    private String color;

    public Figure() {
        ColorSupplier cc = new ColorSupplier();
        this.color = cc.getRandomColor();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract String getFigureInfo();
}
