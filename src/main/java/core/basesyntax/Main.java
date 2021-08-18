package core.basesyntax;

public class Main {
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();
    private static final int MAX_FIGURES_ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        RandomNumberFigures ranodmNumberFigures = new RandomNumberFigures();
        Figure[] figures = new Figure[ranodmNumberFigures.randomInt(MAX_FIGURES_ARRAY_LENGTH)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FIGURE_SUPPLIER.getRandomFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].drawFigure());
        }
    }
}
