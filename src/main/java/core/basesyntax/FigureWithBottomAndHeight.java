package core.basesyntax;

public abstract class FigureWithBottomAndHeight extends Figure {
    protected double width;
    protected double height;

    public FigureWithBottomAndHeight(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

}
