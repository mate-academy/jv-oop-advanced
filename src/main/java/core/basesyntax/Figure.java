package core.basesyntax;

public abstract class Figure {
    private String color;

    public Figure(Color color) {
        this.color = color.name();
    }
}
