package core.basesyntax;

import core.basesyntax.model.behavior.AreaCalculator;
import core.basesyntax.model.behavior.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private String identification;
    private String color;

    public Figure(String color, String identification) {
        this.identification = identification;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getIdentification() {
        return identification;
    }
}
