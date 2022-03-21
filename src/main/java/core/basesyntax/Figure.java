package core.basesyntax;

import core.basesyntax.modul.AreaCalculator;
import core.basesyntax.modul.DrawingSystem;

public abstract class Figure implements AreaCalculator, DrawingSystem {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
