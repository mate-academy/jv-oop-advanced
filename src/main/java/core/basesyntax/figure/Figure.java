package core.basesyntax.figure;

import core.basesyntax.behaviour.Area;
import core.basesyntax.behaviour.Drawable;

public abstract class Figure
        implements Drawable, Area {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected Figure(String color) {
        this.color = color;
    }
}
