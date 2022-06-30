package core.basesyntax;

public abstract class State implements Figure {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
