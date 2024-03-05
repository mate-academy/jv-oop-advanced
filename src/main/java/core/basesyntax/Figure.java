package core.basesyntax;

public abstract class Figure implements Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract String getArea();
}
