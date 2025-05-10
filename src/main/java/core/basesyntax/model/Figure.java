package core.basesyntax.model;

import core.basesyntax.service.AreaCalculator;
import core.basesyntax.service.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private Color color;

    protected Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
