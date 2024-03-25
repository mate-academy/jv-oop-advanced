package core.basesyntax.figures;

import core.basesyntax.utils.AreaCalculator;
import core.basesyntax.utils.Color;
import core.basesyntax.utils.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private Color color;

    public Figure() {
    }

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
