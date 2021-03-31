package core.basesyntax;

public abstract class Figure implements Area {
    private String colour;
    private String property;
    private String type;

    public Figure() {
    }

    public Figure(String type, String colour, String property) {
        this.colour = colour;
        this.property = property;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public String getProperty() {
        return property;
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
