package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        FigureSupplier figuresupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures[i] = figuresupplier.getRandomFigure();
            } else {
                figures[i] = figuresupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }
}
