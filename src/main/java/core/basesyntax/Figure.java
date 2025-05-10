package core.basesyntax;

public abstract class Figure implements AreaOfFigure, DrawInfo {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
