package core.basesyntax;

import core.basesyntax.interfaces.Calculable;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, Calculable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
