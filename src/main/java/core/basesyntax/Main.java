package core.basesyntax;

public class Main {
    private static final FigureSupplier supplier = new FigureSupplier();
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < figuresArray.length; i++) {
            if (i < NUMBER_OF_FIGURES / 2) {
                figuresArray[i] = supplier.getRandomFigure();
            } else {
                figuresArray[i] = supplier.getDefaultFigure();
            }
            figuresArray[i].draw();
        }
    }
}
