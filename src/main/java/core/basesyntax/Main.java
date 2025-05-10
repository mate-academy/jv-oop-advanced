package core.basesyntax;

public class Main {

    public static void main(String[] arg) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figures = new Figure[6];
        for (int i = 0; i <= 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 3; i <= 5; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
