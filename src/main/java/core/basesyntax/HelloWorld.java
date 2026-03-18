package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        int sizeOfArray = 6;
        Figure[] figuresArray = new Figure[sizeOfArray];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 1; i <= sizeOfArray; i++) {
            Figure currFigure = i > sizeOfArray / 2
                    ?
                    figureSupplier.getDefaultFigure()
                    :
                    figureSupplier.getRandomFigure();
            figuresArray[i - 1] = currFigure;
        }

        for (Figure figure : figuresArray) {
            figure.draw();
        }
    }
}
