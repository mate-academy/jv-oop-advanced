package core.basesyntax.figure.type;

import core.basesyntax.behaviour.AreaCalculator;
import core.basesyntax.behaviour.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    protected Figure(String color) {

        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
