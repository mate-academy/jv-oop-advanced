package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_SIZE];

        System.out.println("Generating Figures");

        int halfSize = ARRAY_SIZE / 2;
        for (int i = 0; i < halfSize; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            System.out.printf("Generated random figure #%d%n", i + 1);
        }

        for (int i = halfSize; i < ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            System.out.printf("Generated default figure #%d%n", i + 1);
        }

        System.out.println("\n--- 📋 List of All Figures (Drawing) ---");

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
