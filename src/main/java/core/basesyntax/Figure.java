package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureDrawer {
    private String color;
    private String figureName;

    public Figure(String color, String figureName) {
        this.color = color;
        this.figureName = figureName;
    }

    public String getColor() {
        return color;
    }

    public String getFigureName() {
        return figureName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }
}
