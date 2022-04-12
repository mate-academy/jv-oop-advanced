package core.basesyntax.figure;

import core.basesyntax.FigureAction;

public abstract class Figure implements FigureAction {
    private String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
