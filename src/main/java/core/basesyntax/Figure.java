package core.basesyntax;

public class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract int getArea();
}
