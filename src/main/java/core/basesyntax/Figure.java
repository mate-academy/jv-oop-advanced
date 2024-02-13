package core.basesyntax;

import core.basesyntax.interfaces.AreaFigure;
import core.basesyntax.interfaces.InfoFigure;

public abstract class Figure implements InfoFigure, AreaFigure {
    protected String color;

    protected Figure(String color) {
        this.color = color;
    }
}
