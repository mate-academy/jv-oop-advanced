package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureDraw {
    private String colour;
    private String type;
    private String property;

    public Figure(String type, String colour, String property) {
        this.colour = colour;
        this.type = type;
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void drawFigure() {
        System.out.println("");
    }
}
