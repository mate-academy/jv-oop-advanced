package core.basesyntax.figure;

import core.basesyntax.interfase.AreaCount;
import core.basesyntax.interfase.Draw;

public abstract class Figure implements AreaCount, Draw {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
