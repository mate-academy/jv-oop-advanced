package core.basesyntax.figures;


public abstract class Figure implements Drawable {
    protected String color;
    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected abstract double calculateArea();
}
