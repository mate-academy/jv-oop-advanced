package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int arrayLength = 6;

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[arrayLength];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.defaultFigure();
            }
            figures[i].draw();
        }
    }
}
