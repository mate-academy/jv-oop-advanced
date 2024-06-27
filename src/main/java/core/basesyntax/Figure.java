package core.basesyntax;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Describer;

public abstract class Figure implements Describer, AreaCalculator {
    private String type = "circle";
    private String color = "WHITE";

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
