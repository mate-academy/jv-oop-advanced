package core.basesyntax.figure;

import core.basesyntax.interfaces.AreaCalculator;

public abstract class Figure implements AreaCalculator {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

    protected String getColor() {
        return color;
    }

    public abstract void print();
}
