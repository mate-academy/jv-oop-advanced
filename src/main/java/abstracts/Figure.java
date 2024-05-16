package abstracts;

import enums.Color;
import interfaces.AreaCalculable;
import interfaces.Drawable;

public abstract class Figure implements AreaCalculable, Drawable {
    protected Color color;

    protected Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
