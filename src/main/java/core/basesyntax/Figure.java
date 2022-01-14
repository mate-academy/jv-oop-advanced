package core.basesyntax;

public class Figure {
    private String name;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String drawFigure() {
        return "Figure: " + getName()
                + " units, color: " + getColor();
    }
}
