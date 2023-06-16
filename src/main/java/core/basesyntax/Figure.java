package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public String getColor() {
        return color;
    }

    public Figure(String color) {
        this.color = color;
    }

    public Figure() {
    }
}

