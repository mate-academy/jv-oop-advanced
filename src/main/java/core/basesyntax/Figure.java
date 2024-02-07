package core.basesyntax;

import core.basesyntax.interfaces.FigureDraw;
import core.basesyntax.interfaces.FigureInterface;

public abstract class Figure implements FigureInterface, FigureDraw {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
