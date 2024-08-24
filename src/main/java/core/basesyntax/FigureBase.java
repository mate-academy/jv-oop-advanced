package core.basesyntax;

abstract class FigureBase implements AreaCalculatable, Drawable {
    protected String color;

    public FigureBase(String color) {
        this.color = color;
    }
}
