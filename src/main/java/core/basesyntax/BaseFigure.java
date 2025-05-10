package core.basesyntax;

abstract class BaseFigure implements Figure {
    protected String color;

    public BaseFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
