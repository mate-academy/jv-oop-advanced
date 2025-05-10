package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        Figure[] array = new Figure[6];

        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                array[i] = figure.getRandomFigure();
            } else {
                array[i] = figure.getDefaultFigure();
            }
        }

        for (Figure value : array) {
            value.draw();
        }
    }
}
