package core.basesyntax;

public class Main {
    private static final int NUMBER_CYCLES = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_CYCLES];
        for (int i = 0; i < NUMBER_CYCLES; i++) {
            FigureSupplier figureSupplier = new FigureSupplier();
            if (i < NUMBER_CYCLES / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            System.out.println(figures[i].draw());
        }
    }
}
