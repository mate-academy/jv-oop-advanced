package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureDrawer {
    private String color;
    private String type;

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
