package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure [] figures = new Figure[6];
        figures[0] = figureSupplier.getDefaultFigure();
        figures[1] = figureSupplier.getRandomFigure();
        figures[2] = figureSupplier.getRandomFigure();
        figures[3] = figureSupplier.getRandomFigure();
        figures[4] = figureSupplier.getRandomFigure();
        figures[5] = figureSupplier.getRandomFigure();

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
