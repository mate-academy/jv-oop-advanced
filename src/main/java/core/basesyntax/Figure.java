package core.basesyntax;

public abstract class Figure implements Printer, calculateArea  {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
