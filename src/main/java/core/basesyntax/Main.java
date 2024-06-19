package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int arrayLength = 10;
        Figure[] figures = new Figure[arrayLength];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < arrayLength; i++) {
            if (i < arrayLength / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            System.out.println(figures[i].draw());
        }
    }
}

