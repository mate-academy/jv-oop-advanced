package core.basesyntax;

public abstract class Figure implements FigurePrinter, AreaCalculator{

    private String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

//https://github.com/mate-academy/jv-oop-advanced/pull/669/files
