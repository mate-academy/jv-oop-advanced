package core.basesyntax;

public abstract class Figure implements Area, DrawFigure {
    private final String name;
    private final String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
