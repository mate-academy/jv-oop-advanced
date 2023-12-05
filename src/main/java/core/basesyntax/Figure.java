package core.basesyntax;

public abstract class Figure implements Behavior, State {
    private String color;

    public Figure(String color) {
        this.color = color;
    }
}
