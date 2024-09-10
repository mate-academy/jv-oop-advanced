package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    public static final int amountOfFigures = 5;
    private String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
