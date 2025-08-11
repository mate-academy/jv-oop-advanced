package core.basesyntax;

public class Main {

    private static final int FIGURES_COUNT = 6; // Wybierz jedną, poprawną nazwę

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();

        // Wypełnienie pierwszej połowy tablicy losowymi figurami
        for (int i = 0; i < FIGURES_COUNT / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        // Wypełnienie drugiej połowy tablicy domyślnymi figurami
        for (int i = FIGURES_COUNT / 2; i < FIGURES_COUNT; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        // Wyświetlenie wszystkich figur
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
