package core.basesyntax.figures;

import core.basesyntax.variables.Color;

public abstract class Figure implements FigureBehavior {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
