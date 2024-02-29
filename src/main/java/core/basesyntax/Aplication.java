package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Aplication {
    public static void main (String [] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figura[] figuras = new Figura[6];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                System.out.println(figuras[i] = figureSupplier.getRandomFigure());
                } else {
                System.out.println(figuras[i] = figureSupplier.getDefaultFigure());
            }
        }

    }

}
