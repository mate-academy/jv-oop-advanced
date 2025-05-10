package core.basesyntax;

public class Main {
    private static final int AMOUNT_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figures = new Figure[AMOUNT_OF_FIGURES];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < AMOUNT_OF_FIGURES; i++) {
            if (i < AMOUNT_OF_FIGURES / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            result.append(figures[i]).append(System.lineSeparator());
        }
        System.out.println(result);
    }
}
