package core.basesyntax;

public abstract class Figure implements Behavior,Area {
    public String color;

    public Figure(String color) {
        this.color = color;
    }
}
