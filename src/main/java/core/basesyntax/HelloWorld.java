package core.basesyntax;

public class HelloWorld {
    private static final int SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figures = new Figure[SIZE];
        for (int i = 0; i < SIZE / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = SIZE / 2; i < SIZE; i++) {
            figures[i] = figureSupplier.getdefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }

    }
}
