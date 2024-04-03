package core.basesyntax;

abstract class AbstractFigure implements Figure {
    protected String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

