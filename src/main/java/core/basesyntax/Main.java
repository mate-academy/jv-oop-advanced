package core.basesyntax;

public class Main {
    private static final int SIZE_ARRAY = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE_ARRAY];
        FigureSupplier figureSupplier = new FigureSupplier();
        int middleOfArray = SIZE_ARRAY / 2;
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < middleOfArray
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
        }
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
