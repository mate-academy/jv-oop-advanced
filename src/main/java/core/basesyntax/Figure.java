package core.basesyntax;

import java.awt.Color;

public abstract class Figure implements FigureDrawer, AreaCalculator {
    private Color color;
    private FigureTypes name;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setName(FigureTypes name) {
        this.name = name;
    }

    public FigureTypes getName() {
        return name;
    }
}
