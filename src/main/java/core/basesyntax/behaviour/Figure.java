package core.basesyntax.behaviour;

import core.basesyntax.state.AreaCalculator;
import core.basesyntax.state.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
