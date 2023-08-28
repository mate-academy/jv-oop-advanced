package core.basesyntax.figures;

public abstract class Figure implements Drawable {
    private String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double calculateArea();

}
