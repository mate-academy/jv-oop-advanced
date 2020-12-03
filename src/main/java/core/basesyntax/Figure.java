package core.basesyntax;

public abstract class Figure implements Drawable, Displayable, Calculable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public String getColor() {
        return color.toString();
    }
}
