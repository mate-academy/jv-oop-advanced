package core.basesyntax;

public abstract class Figure implements Drawable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public Figure(Color color) {

    }

    public abstract double getArea();
}
