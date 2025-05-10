package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int arrayLength = 6;
        Figure[] figures = new Figure[arrayLength];
        FigureSupplier figureSupplier = new FigureSupplier();
        int half = arrayLength / 2;

        for (int i = 0; i < figures.length; i++) {
            if (i < half) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
