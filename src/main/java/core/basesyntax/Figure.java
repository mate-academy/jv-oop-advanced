package core.basesyntax;

public abstract class Figure implements FigureBehaviour {
    private String figureName;
    private String color;

    public String getFigureName() {
        return figureName;
    }

    public String getColor() {
        return color;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
