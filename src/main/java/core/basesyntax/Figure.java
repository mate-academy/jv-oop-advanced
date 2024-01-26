package core.basesyntax;

public abstract class Figure implements AreaCalculator, InfoPrint {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
