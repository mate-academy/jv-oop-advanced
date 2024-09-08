package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;

    public Figure(Color color) {
        this.color = String.valueOf(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = String.valueOf(color);
    }
}
