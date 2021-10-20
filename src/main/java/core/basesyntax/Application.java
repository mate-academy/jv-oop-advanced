package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayOfFigure = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < arrayOfFigure.length; i++) {
            if (i >= NUMBER_OF_FIGURES / 2) {
                arrayOfFigure[i] = figureSupplier.getDefaultFigure();
            } else {
                arrayOfFigure[i] = figureSupplier.getRandomFigure();
            }
            System.out.println(arrayOfFigure[i].draw());
        }
    }
}
