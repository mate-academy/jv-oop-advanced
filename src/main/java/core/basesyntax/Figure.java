package core.basesyntax;

public abstract class Figure implements FigureArea, FigureBuilder {

    private final String color;

    public abstract String name();

    public String getColor() {
        return color;
    }

    public Figure(String color) {
        this.color = color;
    }
}
