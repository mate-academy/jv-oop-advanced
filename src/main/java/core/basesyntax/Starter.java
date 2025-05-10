package core.basesyntax;

public class Starter {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figures = new Figure[6];
        figures[0] = figureSupplier.getRandomFigure();
        figures[1] = figureSupplier.getRandomFigure();
        figures[2] = figureSupplier.getRandomFigure();
        figures[3] = figureSupplier.getDefaultFigure();
        figures[4] = figureSupplier.getDefaultFigure();
        figures[5] = figureSupplier.getDefaultFigure();

        for (Figure figure : figures) {
            figure.drawFigure();
        }

    }
}
