package core.basesyntax;

public abstract class Figure implements Area, Draw {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
