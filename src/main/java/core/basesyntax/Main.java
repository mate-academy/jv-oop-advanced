package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[7];
        for (int i = 0; i < figures.length; i++) {
            if (i <= (figures.length / 2)) {
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
