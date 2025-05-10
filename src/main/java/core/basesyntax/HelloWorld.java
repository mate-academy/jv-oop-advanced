package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int count = 0;

        Figure[] figures = new Figure[6];
        for (int i = count; i < (figures.length / 2); i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
            count++;
        }
        for (int i = count; i < figures.length; i++) {
            Figure defaultCircle = figureSupplier.getDefaultFigure();
            defaultCircle.draw();
        }
    }
}
