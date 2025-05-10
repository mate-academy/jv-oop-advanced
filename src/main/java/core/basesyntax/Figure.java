package core.basesyntax;

public abstract class Figure implements Drawable, Calculateable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
