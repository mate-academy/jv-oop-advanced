package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int array_length = 7;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[array_length];
        for (int i = 0; i < array_length; i++) {
            if (i <= (array_length / 2)) {
                figures[i] = figureSupplier.getRandomFigure();
                continue;
            }

            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.calculateArea();
            figure.printInfo();
        }
    }
}
