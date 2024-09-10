package core.basesyntax;

public abstract class Figure implements Draw, AreaCalculate {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
