package core.basesyntax;

public abstract class Figure implements Drawable, Shape {

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }
}
