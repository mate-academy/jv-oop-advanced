package core.basesyntax;

public class Main {
    private static final int MAX_FIGURES_ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        RandomNumberFigures ranodmNumberFigures = new RandomNumberFigures();
        Figure[] figures = new Figure[ranodmNumberFigures.getRandomInt(MAX_FIGURES_ARRAY_LENGTH)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].drawFigure());
        }
    }
}
