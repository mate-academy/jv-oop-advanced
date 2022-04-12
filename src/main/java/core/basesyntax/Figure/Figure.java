package core.basesyntax.Figure;

import core.basesyntax.FigureAction;

import java.util.Arrays;

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
