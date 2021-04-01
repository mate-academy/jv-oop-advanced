package core.basesyntax;

public abstract class Figure implements Drawable, GetArea {
    private Color color;

    Figure(Color color) {
        this.color = color;
    }
    

    public Color getColor() {
        return color;
    }
}
