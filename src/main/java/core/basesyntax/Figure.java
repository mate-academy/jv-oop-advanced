package core.basesyntax;

public abstract class Figure implements AreaCalculate, Drawable {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = String.valueOf(color);
    }

    public String getColor() {
        return color;
    }
}
