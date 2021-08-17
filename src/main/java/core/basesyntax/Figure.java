package core.basesyntax;

public abstract class Figure implements Drawnable {
    private String figureColor;

    public String getFigureColor() {
        return figureColor;
    }

    public void setFigureColor(String figureColor) {
        this.figureColor = figureColor;
    }

    public Figure(String figureColor) {
        this.figureColor = figureColor;
    }
}
