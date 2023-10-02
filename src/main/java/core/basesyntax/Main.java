package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES_IN_EACH_OF_TWO_GROUPS = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < NUMBER_OF_FIGURES_IN_EACH_OF_TWO_GROUPS; i++) {
            figureSupplier.getRandomFigure().draw();
        }
        for (int i = 0; i < NUMBER_OF_FIGURES_IN_EACH_OF_TWO_GROUPS; i++) {
            figureSupplier.getDefaultFigure().draw();
        }
    }
}
