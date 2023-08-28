package core.basesyntax;

import core.basesyntax.interfaces.Calculable;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, Calculable {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
