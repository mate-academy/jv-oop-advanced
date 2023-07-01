package core.basesyntax;

public abstract class Figure {
    private String color;

    abstract String draw();

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
