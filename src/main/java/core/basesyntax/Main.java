package core.basesyntax;

public class Main {
    private static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayOfFigures = new Figure[ARRAY_LENGTH];
        for (int i = 0; i < arrayOfFigures.length; i++) {
            if (i < arrayOfFigures.length / 2) {
                arrayOfFigures[i] = figureSupplier.getRandomFigure();
            } else {
                arrayOfFigures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : arrayOfFigures) {
            System.out.println(figure.draw());
        }
    }
}
