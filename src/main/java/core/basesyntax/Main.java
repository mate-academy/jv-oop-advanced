package core.basesyntax;
public class Main {
    public static void main(String[] args) {
        final int FIGURE_COUNT = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayOfFigures = new Figure[FIGURE_COUNT];
        for (int i = 0; i < arrayOfFigures.length; i++) {
            if (i < (arrayOfFigures.length / 2)) {
                arrayOfFigures[i] = figureSupplier.getRandomFigure();
            } else {
                arrayOfFigures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : arrayOfFigures) {
            figure.draw();
        }
    }
}