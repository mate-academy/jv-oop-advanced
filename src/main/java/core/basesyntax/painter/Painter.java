package core.basesyntax.painter;

import core.basesyntax.figures.Figure;

public class Painter {
    public void drawFigures(Figure[] figures) {
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
