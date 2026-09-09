package core.basesyntax;

import core.basesyntax.enums.Colors;
import core.basesyntax.enums.Figures;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable {
    private final Figures name;
    private final Colors color;
    private float area;

    public Figure(Figures name, Colors color) {
        this.name = name;
        this.color = color;
    }

    public String getDrawingFirstPart() {
        return "Figure: "
                + this.name
                + ", color: "
                + this.color
                + ", area: "
                + this.area
                +" units";
    }

    public void setArea(float area) {
        this.area = area;
    }
}
