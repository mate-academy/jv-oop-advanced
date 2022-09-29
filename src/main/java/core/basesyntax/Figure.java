package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {

    private String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
