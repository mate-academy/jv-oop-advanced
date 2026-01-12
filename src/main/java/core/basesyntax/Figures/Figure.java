package core.basesyntax.Figures;

import core.basesyntax.Interfaces.AreaCalculator;
import core.basesyntax.Interfaces.Draweble;
import core.basesyntax.Supppliers.ColorSupplier;

public abstract class Figure implements Draweble, AreaCalculator {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}