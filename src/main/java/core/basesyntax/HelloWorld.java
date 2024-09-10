package core.basesyntax;

public class HelloWorld {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        BaseShape[] figures = new BaseShape[ARRAY_SIZE];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (BaseShape figure : figures) {
            figure.draw();
        }
    }
}
