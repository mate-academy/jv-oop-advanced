package core.basesyntax;

abstract class Figure {

    public Figure(String color) {
        this.color = color;
    }

    protected String color;

    abstract double getArea();

    abstract void draw();
}
