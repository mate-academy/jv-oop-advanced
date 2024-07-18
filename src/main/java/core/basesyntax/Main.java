package core.basesyntax;

public class Main extends FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 6;
    private static final int FIRST_AMOUNT = 3;

    public static void main(String[] agr) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < figures.length; i++) {
            if (i < FIRST_AMOUNT) {
                figures[i] = supplier.getRandomFigure();
            } else {
                figures[i] = supplier.getDefaultFigure();
            }
        }
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
