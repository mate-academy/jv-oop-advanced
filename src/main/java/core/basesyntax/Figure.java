package core.basesyntax;

abstract class Figure implements Drawable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();
}

