package core.basesyntax.model;

public abstract class Figure implements FigureMethods {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();
}
