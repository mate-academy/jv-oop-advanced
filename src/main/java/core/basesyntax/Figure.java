package core.basesyntax;

public abstract class Figure {
    String color;

    public Figure (String color) {
        this.color = color;
    }

    abstract void draw();
}
