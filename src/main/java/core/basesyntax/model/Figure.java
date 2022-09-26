package core.basesyntax.model;

public abstract class Figure implements FiguresBehaviour {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
