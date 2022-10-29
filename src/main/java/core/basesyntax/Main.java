package core.basesyntax;

public class Main {
    private static final int FIGURES_QUANTITY = 6;  //just comment to commit
    private static final int RANDOM_FIGURES_QUANTITY = 3;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_QUANTITY];
        FigureSupplier randomFigure = new FigureSupplier();
        for (int i = 0; i < FIGURES_QUANTITY; i++) {
            if (i < RANDOM_FIGURES_QUANTITY) {
                figures[i] = randomFigure.getRandomFigure();
                System.out.println(figures[i].toString());
            } else {
                figures[i] = randomFigure.getDefaultFigure();
                System.out.println(figures[i].toString());
            }
        }
    }
}
