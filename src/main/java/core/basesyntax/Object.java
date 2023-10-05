package core.basesyntax;

public abstract class Object implements Figure {
    private String color;

    public Object(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
