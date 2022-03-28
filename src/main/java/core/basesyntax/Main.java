package core.basesyntax;

public class Main {
    private static final int SIZE_OF_FIGURES_ARRAY = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresArray = new Figure[SIZE_OF_FIGURES_ARRAY];
        for (int i = 0; i < SIZE_OF_FIGURES_ARRAY; i++) {
            if (i < SIZE_OF_FIGURES_ARRAY / 2) {
                figuresArray[i] = figureSupplier.getRandomFigure();
                figuresArray[i].draw();
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
                figuresArray[i].draw();
            }
        }
    }
}
