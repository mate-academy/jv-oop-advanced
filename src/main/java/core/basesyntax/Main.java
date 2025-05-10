package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] randomFigures = new Figure[10];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < randomFigures.length; i++) {
            if (i < randomFigures.length / 2) {
                randomFigures[i] = figureSupplier.getRandomFigure();
            } else {
                randomFigures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : randomFigures) {
            figure.draw();
        }
    }
}
