package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figures[] array = new Figures[6];
        int halfArray = array.length / 2;

        for (int i = 0; i < array.length; i++) {
            if (i < halfArray) {
                array[i] = figureSupplier.getRandomFigure();
            } else {
                array[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i].draw(array[i]);
        }
    }
}
