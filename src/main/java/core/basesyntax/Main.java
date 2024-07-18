package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static final int MAX_LEN = 100;

    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figuresArray.length; i++) {
            if (i > Math.floor(figuresArray.length / 2)) {
                figuresArray[i] = figureSupplier.getRandomFigure(MAX_LEN);
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i].draw();
        }
    }
}
