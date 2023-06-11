package core.basesyntax.figures;

import core.basesyntax.behaviour.Area;
import core.basesyntax.behaviour.Drawable;

public abstract class Figure implements Drawable, Area {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public enum Color {
        WHITE,
        YELLOW,
        GREEN,
        BLUE,
        RED
    }

}
