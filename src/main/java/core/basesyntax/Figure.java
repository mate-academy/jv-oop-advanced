package core.basesyntax;

abstract class Figure {

    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    abstract double getArea();

    abstract void draw();
}
