package core.basesyntax;

public abstract class AbstractColor implements Figure, GetArea {
    private String color;

    public AbstractColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
