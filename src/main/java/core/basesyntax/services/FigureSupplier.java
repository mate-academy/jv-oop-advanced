package core.basesyntax.services;

import core.basesyntax.Colors;
import core.basesyntax.figures.Circle;
import core.basesyntax.model.Figure;

public class FigureSupplier {

    public int getFigureCountFromModel() {
        return getFigureCount();
    }

    public double getRandomFigure() {
        return getRandom().nextInt(getFigureCount()) + 1;
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle();
        figure.setArea(getFigureCountFromModel());
        figure.setColor(Colors.WHITE.name());
        return figure;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
