package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = supplier.getRandomFigure();
            }else {
                figures[i] = supplier.getDefaultFigure();
            }
        }

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getFigure());
        }
    }
}
