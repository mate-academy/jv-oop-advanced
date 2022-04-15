package core.basesyntax.figure;

public abstract class Figure {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

    protected String getColor() {
        return color;
    }

    public abstract void print();
}
