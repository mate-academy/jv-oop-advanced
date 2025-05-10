package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String name;
    private String color;

    public Figure(String figureName, String figureColor) {
        this.name = figureName;
        this.color = figureColor;
    }

    public String getFigureColor() {
        return color;
    }

    public String getFigureName() {
        return name;
    }
}
