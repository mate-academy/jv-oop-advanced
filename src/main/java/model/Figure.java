package model;

public abstract class Figure implements Drawable, SquareCalculator {
    private Color color;
    private String figureName;

    public Figure(Color color) {
    }

    public Color getColor() {
        return color;
    }

    public void setColour(Color color) {
        this.color = color;
    }

    public String getFigureName() {
        return figureName;
    }
}
