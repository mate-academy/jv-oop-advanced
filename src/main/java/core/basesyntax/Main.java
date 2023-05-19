package core.basesyntax;


public class Main {

    private static final int SIZE_OF_ARRAY = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[SIZE_OF_ARRAY];

        for (int i = 0; i < SIZE_OF_ARRAY / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = SIZE_OF_ARRAY / 2; i < SIZE_OF_ARRAY; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }

    }

}
