package core.basesyntax;

import core.basesyntax.service.Drawable;
import core.basesyntax.service.VolumeCalculate;

public abstract class Figure implements VolumeCalculate, Drawable {
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
