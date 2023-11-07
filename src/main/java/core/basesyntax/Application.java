package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int arrayLenght = 6;
        final FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArray = new Figure[arrayLenght];

        for (int i = 1; i <= arrayLenght; i++) {
            if (i <= arrayLenght / 2) {
                figureArray[i - 1] = figureSupplier.getRandomFigure();
            } else {
                figureArray[i - 1] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figureArray) {
            figure.draw();
        }
    }
}
