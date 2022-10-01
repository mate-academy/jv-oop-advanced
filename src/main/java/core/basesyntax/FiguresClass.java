package core.basesyntax;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Draw;

public abstract class FiguresClass implements Draw, AreaCalculator {
    private String color;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public FiguresClass(String color) {
        this.color = color;
    }

    public String getColor() {
        this.color = colorSupplier.getRandomColor();
        return color;
    }
}
