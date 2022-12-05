package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresArray = new Figure[6];
        for (int i = 0; i < figuresArray.length; i++) {
            if (i < figuresArray.length / 2) {
                figuresArray[i] = figureSupplier.getRandomFigure();
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure value: figuresArray) {
            value.draw();
        }
    }
}
