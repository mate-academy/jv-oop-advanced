package core.basesyntax;

public abstract class Figure {
    private String color;

    public abstract void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
