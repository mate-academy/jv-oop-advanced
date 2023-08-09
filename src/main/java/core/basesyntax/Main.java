package core.basesyntax;

public class Main {
    private static final FigureSupplier supplier = new FigureSupplier();
    private static final int FIGURE_COUNTER = 6;

    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[FIGURE_COUNTER];
        for (int i = 0; i < figuresArray.length; i++) {
            if (i < FIGURE_COUNTER / 2) {
                figuresArray[i] = supplier.getRandomFigure();
            } else {
                figuresArray[i] = supplier.getDefaultFigure();
            }
            figuresArray[i].draw();
        }
    }
}
