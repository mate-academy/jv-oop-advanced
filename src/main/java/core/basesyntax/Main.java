package core.basesyntax;

public class Main {
    private static final int FIGURE_SIZE = 6;
    private static final int NUMBER_OF_DEFAULT_FIGURES = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        String[] figureArray = new String[FIGURE_SIZE];
        for (int i = 0; i < figureArray.length; i++) {
            if (i < NUMBER_OF_DEFAULT_FIGURES) {
                figureArray[0] = figureSupplier.getDefaultFigure().getDraw();
                System.out.println(figureArray[0]);
            } else {
                figureArray[i] = figureSupplier.getRandomFigure().getDraw();
                System.out.println(figureArray[i]);
            }
        }
    }
}
