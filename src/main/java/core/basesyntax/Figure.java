package core.basesyntax;

public abstract class Figure implements FigureOperations, Info {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
