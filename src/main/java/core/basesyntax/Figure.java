package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String figureColor;

    public Figure(String figureColor) {
        this.figureColor = figureColor;
    }

    public String getFigureColor() {
        return figureColor;
    }

    public void setFigureColor(String figureColor) {
        this.figureColor = figureColor;
    }

    @Override
    public abstract double getArea();

    public abstract void draw();
}
