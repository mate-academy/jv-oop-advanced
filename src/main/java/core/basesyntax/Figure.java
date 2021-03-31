package core.basesyntax;

public abstract class Figure implements Drawer, Area {
    private final String figureProperty;
    private final String color;

    public Figure(String figureProperty, String color) {
        this.figureProperty = figureProperty;
        this.color = color;
    }

    public String getFigureProperty() {
        return figureProperty;
    }

    public String getColor() {
        return color;
    }

}
