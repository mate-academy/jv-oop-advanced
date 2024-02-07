package core.basesyntax.model;

public abstract class Figure implements Drawable, AreaCalculated {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
