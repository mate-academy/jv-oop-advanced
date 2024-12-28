package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public abstract class Figure implements FigureBehavior {
    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    private Color color;


}
