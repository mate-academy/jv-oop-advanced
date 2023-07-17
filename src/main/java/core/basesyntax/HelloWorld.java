package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        int halfArray = figures.length / 2;
        for (int i = 0; i < figures.length; i++) {
            FigureSupplier figureSupplier = new FigureSupplier();
            if (i < halfArray) {
                Figure randomFigure = figureSupplier.getRandomFigure();
                figures[i] = randomFigure;
            } else {
                Figure defaultFigure = figureSupplier.getDefaultFigure();
                figures[i] = defaultFigure;
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
