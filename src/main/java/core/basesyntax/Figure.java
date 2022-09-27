package core.basesyntax;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    abstract String getName();

    abstract double area();

     String getColor() {
        return color;
     }

     abstract void infoAboutFigure();
}
