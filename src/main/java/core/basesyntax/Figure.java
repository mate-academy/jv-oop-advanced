package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
