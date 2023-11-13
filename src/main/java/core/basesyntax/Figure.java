package core.basesyntax;

abstract class Figure implements AreaCalculator, Drawing {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
