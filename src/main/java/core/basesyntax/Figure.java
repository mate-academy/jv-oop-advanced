package core.basesyntax;

public abstract class Figure implements FigureDifferentFunctions {
    private String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
