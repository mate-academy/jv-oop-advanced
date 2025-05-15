package core.basesyntax.model;

public abstract class Shape implements Figure {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
