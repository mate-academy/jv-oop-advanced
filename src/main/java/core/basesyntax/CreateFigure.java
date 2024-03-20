package core.basesyntax;

public class CreateFigure {
    public static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figureArray = new Figure[NUMBER_OF_FIGURES];

        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            FigureSupplier figureSupplier = new FigureSupplier();
            if (i < NUMBER_OF_FIGURES / 2) {
                figureArray[i] = figureSupplier.getRandomFigure();
            } else {
                figureArray[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figureArray) {
            System.out.println(figure.drawArea());
        }
    }
}
