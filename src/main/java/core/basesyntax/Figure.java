package core.basesyntax;

abstract class Figure implements Drawable, Measurable {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();
}
