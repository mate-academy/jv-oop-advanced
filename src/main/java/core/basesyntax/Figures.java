package core.basesyntax;

public abstract class Figures implements AreaCalculator, Drawable {
    private String color;

    public Figures(String color) {
        this.color = color;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }
}
