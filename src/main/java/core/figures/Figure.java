package core.figures;

import core.interfaces.AreaCalculator;
import core.interfaces.Drawer;
import randomizers.sourcerand.Colors;

public abstract class Figure implements Drawer, AreaCalculator {
    private Colors figureColor;

    public Figure(Colors figureColor) {
        this.figureColor = figureColor;
    }

    public Colors getFigureColor() {
        return figureColor;
    }
}
