package core.basesyntax;

public class Main {

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure [] figures = new Figure[6];
        figures[0] = figureSupplier.getRandomFigure(5);
        figures[1] = figureSupplier.getRandomFigure(4);
        figures[2] = figureSupplier.getRandomFigure(3);
        figures[3] = figureSupplier.getDefaultFigure();
        figures[4] = figureSupplier.getDefaultFigure();
        figures[5] = figureSupplier.getDefaultFigure();

        for (Figure figure : figures) {
            figure.toDraw();
        }
    }
}
