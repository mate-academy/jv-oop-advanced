package core.basesyntax;

import core.basesyntax.arraygenerator.FigureArrayGenerator;
import core.basesyntax.figures.Figure;
import core.basesyntax.painter.Painter;

public class Application {
    public static void main(String[] args) {
        FigureArrayGenerator figureArrayGenerator = new FigureArrayGenerator();
        Painter painter = new Painter();
        Figure[] figures = figureArrayGenerator.generateArray();
        painter.drawFigures(figures);
    }
}
