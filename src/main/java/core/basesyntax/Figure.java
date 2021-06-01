package core.basesyntax;

public abstract class Figure {
    String name;
    String color;

    public Figure() {

    }
    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    abstract void draw();
}
