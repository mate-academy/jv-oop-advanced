package core.figures;

import core.interfaces.AreaCalculator;
import core.interfaces.Drawer;
import randomizers.sourcerand.Color;

public abstract class Figure implements Drawer, AreaCalculator {
    private Color color;

    public Figure(Color figureColor) {
        this.color = figureColor;
    }

    public Color getColor() {
        return color;
    }
}
