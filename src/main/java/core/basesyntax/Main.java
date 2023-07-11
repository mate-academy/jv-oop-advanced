package core.basesyntax;

public class Main {
    private static final int RANDOM_SIZE_OF_ARRAY = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

        public static void main(String[] args) {
        Figure[] figures = new Figure[RANDOM_SIZE_OF_ARRAY];
        for (int i = 0; i < RANDOM_SIZE_OF_ARRAY; i++) {
            if (i < RANDOM_SIZE_OF_ARRAY / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }

            figures[i].draw();
        }
    }

}
