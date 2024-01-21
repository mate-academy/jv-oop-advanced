package core.basesyntax;

/**
 * Feel free to remove this clasʼs and create your own.
 */
public class Main {
    public static void main(String[] args) {
        FigureSupplierImpl figureSupplier = new FigureSupplierImpl(new ColorSupplierImpl());
        Figure[] figures = new Figure[9];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure f: figures) {
            System.out.println(f.draw());
        }
    }

}
