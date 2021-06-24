package core.basesyntax;

public abstract class Figure implements Drawer, ParametersCalculator {
    private String figureProperty;
    private String color;

    public Figure(String figureProperty, String color) {
        this.figureProperty = figureProperty;
        this.color = color;
    }

    public String getFigureProperty() {
        return figureProperty;
    }

    public void setFigureProperty(String figureProperty) {
        this.figureProperty = figureProperty;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
