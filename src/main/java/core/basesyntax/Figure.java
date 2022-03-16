package core.basesyntax;

public abstract class Figure implements Drawable {
    private String color;

    public abstract double area();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
