package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;
    private String typeOfFigure;

    public Figure(String color, String typeOfFigure) {
        this.color = color;
        this.typeOfFigure = typeOfFigure;
    }

    public String getTypeOfFigure() {
        return this.typeOfFigure = typeOfFigure;
    }

    public String getColor() {
        return this.color = color;
    }
}
