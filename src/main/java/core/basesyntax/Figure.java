package core.basesyntax;

abstract class Figure implements Drawable, AreaCalculator {
    protected String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public String draw() {
        return System.out.printf("Figure: %s, \tColor: %s, \tArea: %s, \t",
                getClass().getSimpleName(), color, getArea()).toString();
    }
}
