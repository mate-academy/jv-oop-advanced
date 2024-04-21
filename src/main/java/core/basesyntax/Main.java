package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        int arraySize = 6;
        Figure[] figures = new Figure[arraySize];

        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = FigureSupplite.getRandomFigure();
        }

        for (int i = arraySize / 2; i < arraySize; i++) {
            figures[i] = FigureSupplite.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
