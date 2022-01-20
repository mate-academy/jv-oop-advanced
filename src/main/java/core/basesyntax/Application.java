package core.basesyntax;

public class Application {
    public static final int SIZE_ARRAY = 6;

    public static void main(String[] args) {

        Figure[] figures = new Figure[SIZE_ARRAY];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < SIZE_ARRAY / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = SIZE_ARRAY / 2; i < SIZE_ARRAY; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
