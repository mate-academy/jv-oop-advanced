package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private static String color;

    public Figure(String color) {
        this.color = color;
    }

    public static String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
