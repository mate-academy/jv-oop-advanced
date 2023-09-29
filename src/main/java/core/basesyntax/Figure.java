package core.basesyntax;

public abstract class Figure implements Drawable {

    private String color;

    public Figure(String color) {
        setColor(color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();
}
