package core.basesyntax;

public class Main {
    public static void main(String [] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        int groupFigures = 2;

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / groupFigures) {
                figures[i] = figureSupplier.getRandomFigure();
            }
            if (i >= figures.length / groupFigures) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
