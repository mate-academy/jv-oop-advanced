package core.basesyntax;

public abstract class Figure implements Squarable {
    protected final String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getSquare();
}
