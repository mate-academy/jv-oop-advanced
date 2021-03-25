package core.basesyntax;

public abstract class Figure implements Area {
    private String color;
    private String figureName;

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

    public abstract String drawFigure();

    public abstract Figure getRandomFigure();

}
