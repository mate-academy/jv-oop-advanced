package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculable {
    private String color;
    private String typeOfFigure;

    Figure(String color, String typeOfFigure) {
        this.color = color;
        this.typeOfFigure = typeOfFigure;
    }

    String getColor() {
        return this.color;
    }

    public String getTypeOfFigure() {
        return this.typeOfFigure;
    }

}
