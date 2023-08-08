package core.basesyntax;

abstract class Figure implements IDrawble {
    protected String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    abstract double getArea();

    @Override
    public String draw() {
        return System.out.printf("Figure: %s, \tColor: %s, \tArea: %s, \t",
                getClass().getSimpleName(), color, getArea()).toString();
    }
}
