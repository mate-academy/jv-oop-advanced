package core.basesyntax;

public class HelloWorld {
    private static final int ARRAY_SIZE = 6;
    private static final int HALF_SIZE = ARRAY_SIZE / 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_SIZE];

        for (int i = 0; i < HALF_SIZE; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = HALF_SIZE; i < ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        System.out.println("--- Array of Figures ---");
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
