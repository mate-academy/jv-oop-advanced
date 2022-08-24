package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.InfoPrinter;

public abstract class Figure implements AreaCalculator, InfoPrinter {
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
