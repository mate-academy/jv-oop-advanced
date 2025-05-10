package core.basesyntax;

public class Main {
    private static final int MAX_SIZE_OF_ARRAY = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[MAX_SIZE_OF_ARRAY];
        for (int i = 0;i < MAX_SIZE_OF_ARRAY;i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomResult();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
