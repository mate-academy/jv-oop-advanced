package core.basesyntax.model;

public abstract class Figure implements AreaCalculator, Drawble {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
