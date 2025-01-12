package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int arraySize = 5;

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[arraySize];

        for (int i = 0; i < figures.length; i++) {
            if (i <= figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure(i);
            } else {
                figures[i] = figureSupplier.getDefaultFigure(i);
            }
            figures[i].draw();
        }
    }
}
