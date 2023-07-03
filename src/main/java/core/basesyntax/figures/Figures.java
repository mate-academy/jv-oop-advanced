package core.basesyntax.figures;

import core.basesyntax.properties.Drawing;

public abstract class Figures implements Drawing {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String unitOrUnits(int examination) {
        return examination == 1 ? "unit" : "units";
    }
}
