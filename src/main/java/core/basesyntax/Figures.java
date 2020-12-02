package core.basesyntax;

public abstract class Figures implements Drawable, Displayable {
    private Color color;

    public Figures(Color color) {
        this.color = color;
    }

    public String getColor() {
        return color.toString();
    }

    public abstract double getArea();
}

