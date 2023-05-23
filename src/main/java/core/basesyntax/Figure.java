package core.basesyntax;

public abstract class Figure implements AreaCalculable, Drawable {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
