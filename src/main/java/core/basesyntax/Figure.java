package core.basesyntax;

public abstract class Figure {
    private String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract double area();

    abstract String nameOfFigure();

    abstract void infoAboutFigure();

}
