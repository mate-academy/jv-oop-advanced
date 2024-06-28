package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.Type;
import core.basesyntax.interfaces.AreaCalculable;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculable {
    private String type = Type.CIRCLE.name().toLowerCase();;
    private String color = Color.WHITE.name();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
