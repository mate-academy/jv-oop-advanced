package core.basesyntax.figures;

import core.basesyntax.Area;
import core.basesyntax.Draw;

public abstract class Figure implements Area, Draw {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
