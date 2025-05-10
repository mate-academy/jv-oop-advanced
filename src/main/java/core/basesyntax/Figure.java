package core.basesyntax;

public abstract class Figure implements SquareOfFigures {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract String getInfo();
}
