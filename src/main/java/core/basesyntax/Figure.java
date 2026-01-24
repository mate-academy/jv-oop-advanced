package core.basesyntax;

public abstract class Figure implements Drawable, Calculated {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
