package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculate {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public Figure() {
    }

    public String getColor() {
        return color;
    }
}
