package core.basesyntax;

public abstract class Figure implements Drawable, Areaable {
    private String color;

    Figure(String color) {
        this.color = color;
    }

    protected Figure() {
    }

    public String getColor() {
        return this.color;
    }
}
