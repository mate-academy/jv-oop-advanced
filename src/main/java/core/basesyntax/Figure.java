package core.basesyntax;

abstract class Figure {

    protected String name = "";

    abstract String color();

    abstract double area();

    abstract String showName();

    String display() {
        return null;
    }
}
