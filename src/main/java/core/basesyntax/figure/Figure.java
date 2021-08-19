package core.basesyntax.figure;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public void setFigureColor(String color) {
        this.color = color;
    }

    public String getFigureColor() {
        return color;
    }
}
