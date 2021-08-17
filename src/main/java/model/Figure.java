package model;

public abstract class Figure implements InformationWriter, SquareCalculator {
    private Color color;
    private String figureName;

    public Figure(Color color) {
    }

    public Color getColor() {
        return color;
    }

    public void setColour(Color colour) {
        this.color = colour;
    }

    public String getFigureName() {
        return figureName;
    }

    public void setFigureName(String figuretype) {
        this.figureName = figuretype;
    }

    public abstract double getArea();

    public abstract void setParams(int[] params, Color color);
}
