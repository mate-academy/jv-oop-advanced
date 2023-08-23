package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        final int arraySize = 4;

        Figure[] figure = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < arraySize; i++) {
            if (i < arraySize / 2) {
                figure[i] = figureSupplier.getRandomFigure();
            } else {
                // figure[i] = new Rectangle(String.valueOf(Color.RED), 9.0, 4.0);
                //figure[i] =  new Square(String.valueOf(Color.BLUE), 8.0);
                figure[i] = figureSupplier.getDefaultFigure();
            }

        }

        for (Figure figures : figure) {
            figures.draw();
        }
    }
}
