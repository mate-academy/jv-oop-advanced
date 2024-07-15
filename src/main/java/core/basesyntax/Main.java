package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figuresArray.length; i++) {
            if (i > Math.floor(figuresArray.length / 2)) {
                figuresArray[i] = figureSupplier.getRandomFigure(100);
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i].draw();
        }
    }
}
