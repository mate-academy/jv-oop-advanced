package core.basesyntax;

public class Application {

    private static final int FIGURE_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURE_AMOUNT; i++) {
            if (i < FIGURE_AMOUNT / 2) {
                System.out.println(figureSupplier.getRandom());
            } else {
                System.out.println(figureSupplier.getDefaultFigure());
            }
        }
    }
}
