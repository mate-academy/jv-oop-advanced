package core.basesyntax.model;

import core.basesyntax.behavior.FigureInterface;
import core.basesyntax.utils.Color;

public abstract class Figure implements FigureInterface {
    protected Color color;

    public Figure() {
    }

    public Figure(Color color) {
        this.color = color;
    }
}
