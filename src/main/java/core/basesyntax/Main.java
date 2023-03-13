package core.basesyntax;

public class Main {
    private static final int FIGURE_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArray = new Figure[FIGURE_SIZE];
        for (int i = 0; i < figureArray.length; i++) {
            if (i < figureArray.length / 2) {
                figureArray[0] = figureSupplier.getDefaultFigure();
                figureArray[0].getDraw();
            } else {
                figureArray[i] = figureSupplier.getRandomFigure();
                figureArray[i].getDraw();
            }
        }
    }
}
