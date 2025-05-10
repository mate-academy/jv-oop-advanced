package core.basesyntax;

public class FigureMain {
    private static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[FIGURE_COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figuresArray.length; i++) {
            if (i < figuresArray.length / 2) {
                figuresArray[i] = figureSupplier.getRandomFigure();
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
            }
            figuresArray[i].getDescription();
        }
    }
}
