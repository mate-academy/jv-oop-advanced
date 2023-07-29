package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        int arraySize = 6;

        Figure[] figures = new Figure[arraySize];

        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = FigureSuplier.getRandomFigure();
        }

        for (int i = arraySize / 2; i < arraySize; i++) {
            figures[i] = FigureSuplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.drawFigure();
        }
    }
}

