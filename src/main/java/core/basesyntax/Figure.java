package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;
    private String figureName;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFigureName() {
        return figureName;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }
}
