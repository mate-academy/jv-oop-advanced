package core.basesyntax.model;

import core.basesyntax.interfaces.Calculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Calculator, Drawable {
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
