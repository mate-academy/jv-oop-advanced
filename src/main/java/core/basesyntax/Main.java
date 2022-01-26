package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int size = 6;
        FigureSupplier figureSupplier = new FigureSupplier();

        Figures[] array = new Figures[size];
        int halfArray = array.length / 2;

        for (int i = 0; i < array.length; i++) {
            if (i < halfArray) {
                array[i] = figureSupplier.getRandomFigure();
            } else {
                array[i] = figureSupplier.getDefaultFigure();
            }
            array[i].draw();
        }
    }
}
