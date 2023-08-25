package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculation {
    private String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
