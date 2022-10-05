package core.basesyntax;

public abstract class Figure implements Area, Drawable {
    public String color;

    public Figure(String color) {
        this.color = color;
    }
}
