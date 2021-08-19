package core.basesyntax.model;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private Colour colour;

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
}
