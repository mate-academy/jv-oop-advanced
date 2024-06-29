package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.interfaces.AreaCalculable;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculable {
    private String color = Color.WHITE.name();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
