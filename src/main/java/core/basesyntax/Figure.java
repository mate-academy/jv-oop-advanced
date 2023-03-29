package core.basesyntax;

public abstract class Figure implements AreaCalculator, RandomFigureCreator, Info {
    private String color;

    public Figure() {

    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
