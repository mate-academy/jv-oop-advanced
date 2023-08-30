package core.basesyntax.abstracts;

import core.basesyntax.interfaces.Drawable;
import core.basesyntax.interfaces.FigureArea;

public abstract class Figure implements Drawable, FigureArea {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
