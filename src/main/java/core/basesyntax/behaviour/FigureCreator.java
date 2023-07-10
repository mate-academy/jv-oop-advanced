package core.basesyntax.behaviour;

import core.basesyntax.figure.Figure;

public interface FigureCreator {
    Figure getRandomFigure();

    Figure getDefaultFigure();
}
