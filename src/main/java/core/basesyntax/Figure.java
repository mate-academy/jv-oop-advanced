package core.basesyntax;

public abstract class Figure {
    public String color;

    Figure(String color) {
        this.color = color;
    }

    @Override
    public abstract String toString();
}









