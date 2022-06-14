package core.basesyntax;

public class Main {
    private static final int FIGURES_NUMBER = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] randomFigures = new Figure[FIGURES_NUMBER];
        for (int i = 0; i < randomFigures.length; i++) {
            if (i < randomFigures.length / 2) {
                randomFigures[i] = figureSupplier.getRandomFigure();
            } else {
                randomFigures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure randomFigure : randomFigures) {
            randomFigure.draw();
        }
    }
}
