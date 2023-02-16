package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 3; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }
        for (int i = 3; i < 6; i++) {
            figures[i] = FigureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }


