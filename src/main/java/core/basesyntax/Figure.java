package main.java.core.basesyntax;

public abstract class Figure implements AreaCalculator, FigurePlotter {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
