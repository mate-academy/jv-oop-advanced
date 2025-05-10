package core.basesyntax;

public class Main {
    private static final int RANDOM_FIGURES_ARRAY_SIZE = 3;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] randomFiguresArray = new Figure[RANDOM_FIGURES_ARRAY_SIZE];
        randomFiguresArray[RANDOM_FIGURES_ARRAY_SIZE - 1] = figureSupplier.getDefaultFigure();
        for (int i = 0; i < (randomFiguresArray.length - 1); i++) {
            randomFiguresArray[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 0; i < randomFiguresArray.length; i++) {
            randomFiguresArray[i].draw();
        }
    }
}
