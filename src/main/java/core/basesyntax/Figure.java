package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculable {
    private String color;

    Figure(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

}
