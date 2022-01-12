package core.basesyntax.entities;

import core.basesyntax.interfaces.Drawable;
import core.basesyntax.interfaces.Obtaining;

public abstract class Figure implements Drawable, Obtaining, Cloneable {
    public static final Integer COEFFICIENT_TWO = 2;
    private Color color;

    public Figure() {
    }

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Figure clone() {
        try {
            return (Figure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
