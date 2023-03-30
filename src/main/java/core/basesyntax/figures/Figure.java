package core.basesyntax.figures;

public abstract class Figure implements FigureEvaluation, IsDrawable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
