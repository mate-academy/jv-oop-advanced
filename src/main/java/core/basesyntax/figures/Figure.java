package core.basesyntax.figures;

public abstract class Figure implements Drawable {
    protected String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();
}
