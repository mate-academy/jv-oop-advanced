package core.basesyntax;

public class Main {
    private static final int NUM_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] numOfFigures = new Figure[NUM_OF_FIGURES];

        for (int i = 0; i < numOfFigures.length; i++) {
            numOfFigures[i] = i < NUM_OF_FIGURES / 2
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }

        for (Figure figure : numOfFigures) {
            System.out.println(figure.draw());
        }
    }
}
