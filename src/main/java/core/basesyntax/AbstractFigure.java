package core.basesyntax;

abstract class AbstractFigure implements Figure,Drawable {
    private String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
