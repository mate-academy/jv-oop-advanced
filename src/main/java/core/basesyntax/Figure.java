package core.basesyntax;

public class Figure implements Drawable {
    private String figureName;
    private double figureArea;
    private Color color;

    public String getFigureName() {
        return figureName;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }

    public double getFigureArea() {
        return figureArea;
    }

    public void setFigureArea(double figureArea) {
        this.figureArea = figureArea;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
    }

}
