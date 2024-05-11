package core.basesyntax.domain.parent;

public abstract class Figure implements Drawable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double calculateArea();
}
