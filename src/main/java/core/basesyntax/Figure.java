package core.basesyntax;

public abstract class Figure implements Draweble,Area {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
