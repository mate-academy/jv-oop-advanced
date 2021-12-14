package core.basesyntax;

public abstract class Figure implements Area, Draw {
    protected String color;

    public String getColor() {
        return color;
    }
}
