package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        final int numberOfFigures = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[numberOfFigures];

        for (int i = 0; i < numberOfFigures; i++) {
            if (i < numberOfFigures / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i].draw());
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i].draw());
            }
        }
    }

}
