package core.basesyntax.figure;

import core.basesyntax.misc.AreaCalculator;
import core.basesyntax.misc.Drawable;

public abstract class Figure implements Drawable,AreaCalculator {
    private String color;
    private String type;

    public Figure(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
