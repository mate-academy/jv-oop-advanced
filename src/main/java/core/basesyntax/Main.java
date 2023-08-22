package core.basesyntax;

public class Main {
    private static final int RANDOM_FIGURES_ARRAY_SIZE = 6;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] randomFiguresArray = new Figure[RANDOM_FIGURES_ARRAY_SIZE];
        for (int i = 0; i < randomFiguresArray.length; i++) {
            if (i < randomFiguresArray.length / 2) {
                randomFiguresArray[i] = figureSupplier.getRandomFigure();
            } else {
                randomFiguresArray[i] = figureSupplier.getDefaultFigure();
            }
            randomFiguresArray[i].draw();
        }
    }
}
