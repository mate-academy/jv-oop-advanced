package core.basesyntax;

public abstract class Figure implements AreaCalculated, Drawable {

    private String figureColor;

    public Figure(String figureColor) {
        this.figureColor = figureColor;
    }

    public String getFigureColor() {
        return figureColor;
    }
}
