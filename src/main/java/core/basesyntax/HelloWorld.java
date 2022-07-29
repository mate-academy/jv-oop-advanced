package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].setColor(colorSupplier.getRandomColor());
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure: figures) {
            figure.getInfo();
        }
    }

}
