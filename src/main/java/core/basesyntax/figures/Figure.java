package core.basesyntax.figures;

import core.basesyntax.CalculateSquare;

public abstract class Figure implements CalculateSquare {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract String toString();
}
