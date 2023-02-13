package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private Color color;
    private TypeOfFigure typeOfFigure;

    public Figure(Color color, TypeOfFigure typeOfFigure) {
        this.setColor(color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
