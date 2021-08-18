package core.basesyntax.behaviour;

import core.basesyntax.state.AreaCalculator;
import core.basesyntax.state.Draw;

public abstract class Figure implements AreaCalculator, Draw {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
