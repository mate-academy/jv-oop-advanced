package core.basesyntax;

public abstract class Figure implements Behavior,Area {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
