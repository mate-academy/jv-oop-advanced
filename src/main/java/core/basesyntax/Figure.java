package core.basesyntax;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public String getColor() {
        return color.name();
    }
}
