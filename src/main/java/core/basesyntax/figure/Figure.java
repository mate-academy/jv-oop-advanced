package core.basesyntax.figure;

import core.basesyntax.color.Color;

public abstract class Figure implements Squared {

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
