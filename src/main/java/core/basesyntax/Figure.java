package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private Color color;
    private TypeOfFigure typeOfFigure;

    public Figure(Color color, TypeOfFigure typeOfFigure) {
        this.color = color;
        this.typeOfFigure = typeOfFigure;
    }

    public TypeOfFigure getTypeOfFigure() {
        return typeOfFigure;
    }

    public void setTypeOfFigure(TypeOfFigure typeOfFigure) {
        this.typeOfFigure = typeOfFigure;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
