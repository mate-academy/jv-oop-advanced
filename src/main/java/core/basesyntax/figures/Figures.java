package core.basesyntax.figures;

import core.basesyntax.properties.Drawing;
import core.basesyntax.state.Color;

public abstract class Figures implements Drawing {
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String unitOrUnits(int examination) {
        return examination == 1 ? "unit" : "units";
    }
}
