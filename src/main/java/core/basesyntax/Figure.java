package core.basesyntax;

public abstract class Figure implements AreaCalculate, Drawable {
    protected String color;

    public Figure() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
