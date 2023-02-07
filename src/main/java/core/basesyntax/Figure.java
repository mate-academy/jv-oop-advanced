package core.basesyntax;

public abstract class Figure implements MathMethods, DrawMethods {
    private Color color;

    public void toDraw() {

    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
