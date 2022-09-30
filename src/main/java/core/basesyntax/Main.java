package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int FIGURE_AMOUNT = 6;
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figureArray = new Figure[FIGURE_AMOUNT];
        for (int i = 0; i < figureArray.length; i++) {
            if (i < 3) {
                figureArray[i] = figureSupplier.getRandomFigure();
                figureArray[i].draw();
            } else {
                figureArray[i] = figureSupplier.getDefaultFigure();
                figureArray[i].draw();
            }
        }
    }
}
