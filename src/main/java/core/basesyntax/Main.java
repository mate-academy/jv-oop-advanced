package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int numberOfFigures = 6;

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < numberOfFigures; i++) {
            if (i < numberOfFigures / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure currentFigure : figures) {
            currentFigure.draw();
        }
    }
}
