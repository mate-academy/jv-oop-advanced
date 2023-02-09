package core.basesyntax.model;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color.toLowerCase();
    }

    public void setColor(String color) {
        this.color = color;
    }
}
