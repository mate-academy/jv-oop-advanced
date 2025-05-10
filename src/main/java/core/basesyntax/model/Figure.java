package core.basesyntax.model;

public abstract class Figure implements AreaCalculating, Drawing {
    private String color;

    public Figure(String figureColor) {
        this.color = figureColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
