package core.basesyntax;

public abstract class Figure implements FigureArea, Draw {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
