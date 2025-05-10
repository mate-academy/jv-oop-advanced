package abstracts;

import enums.Color;
import interfaces.AreaCalculable;
import interfaces.Drawable;

public abstract class FigureAbstract implements AreaCalculable, Drawable {
    protected Color color;

    protected FigureAbstract(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
