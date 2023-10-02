package core.basesyntax;

public class Main {
    private static final int FIGURES_TO_CREATE = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();

        Figure[] arrayOfFigures = new Figure[FIGURES_TO_CREATE];

        for (int i = 0; i < arrayOfFigures.length; i++) {
            arrayOfFigures[i] = i < FIGURES_TO_CREATE / 2
                    ? supplier.getRandomFigure()
                    : supplier.getDefaultFigure();
        }

        for (Figure figure : arrayOfFigures) {
            System.out.println(figure.draw());
        }
    }
}
