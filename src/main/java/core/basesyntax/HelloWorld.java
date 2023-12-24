package core.basesyntax;

public class HelloWorld {
    private static final int MAX_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[MAX_FIGURES];
        for (int i = 0; i < figures.length; ++i) {
            if (i < 3) {
                figureSupplier.getRandomFigure().printInfo();
                continue;
            }
            figureSupplier.getDefaultFigure().printInfo();
        }
    }
}
