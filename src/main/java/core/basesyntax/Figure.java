package core.basesyntax;

public abstract class Figure implements CommonInformation, FigureArea {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract String getName();

    public String getColor() {
        return color;
    }
}
