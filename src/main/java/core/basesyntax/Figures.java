package core.basesyntax;

public abstract class Figures implements Area, Drawable {
    private String color;

    public Figures(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();
    public abstract void draw();
}
