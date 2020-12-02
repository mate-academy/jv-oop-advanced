package core.basesyntax.figures;

public abstract class Shape implements Drawable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return this.color;
    }

}
