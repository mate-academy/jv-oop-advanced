package abstracts;

import enums.Colors;
import interfaces.AreaCalculable;
import interfaces.Drawable;

public abstract class Figure implements AreaCalculable, Drawable {
    protected Colors color;

    protected Figure(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }
}
