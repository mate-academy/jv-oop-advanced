package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureDrawer {
    private String type;
    private String color;

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
