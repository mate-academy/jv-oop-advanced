package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        Figure[] array = new Figure[6];
        for (int i = 0;i <= array.length / 2;i++) {
            array[i] = figure.getRandomFigure();
        }
        for (int i = array.length / 2;i <= array.length - 1;i++) {
            array[i] = figure.getDefaultFigure();
        }
        for (Figure figures : array) {
            figures.draw();
        }
    }
}
