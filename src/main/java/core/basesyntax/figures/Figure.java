package core.basesyntax.figures;

public abstract class Figure implements FigureEvaluation, Drawable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
