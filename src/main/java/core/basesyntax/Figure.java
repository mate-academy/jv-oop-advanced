package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    protected Figure(Color color) {
        this.color = String.valueOf(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public void draw() {
    }
}
