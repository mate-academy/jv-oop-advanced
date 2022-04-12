package core.basesyntax.figure;

import core.basesyntax.figureAction;

public abstract class Figure implements figureAction {
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