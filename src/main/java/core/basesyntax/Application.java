package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int arrayLenght = 6;
        final FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 1; i <= arrayLenght; i++) {
            if (i <= arrayLenght / 2) {
                Figure figure = figureSupplier.getRandomFigure();
                figure.draw();
            } else {
                Figure figure = figureSupplier.getDefaultFigure();
                figure.draw();
            }
        }
    }
}
