package core.basesyntax;

public class Main {
    private static final int COUNT_OF_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] randomFigures = new Figure[COUNT_OF_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < COUNT_OF_FIGURES; i++) {
            randomFigures[i] = i < (COUNT_OF_FIGURES / 2)
                    ? figureSupplier.getRandomFigure() :
                    figureSupplier.getDefaultFigure();
        }

        for (int i = 0; i < randomFigures.length; i++) {
            randomFigures[i].draw();
        }
    }
}
