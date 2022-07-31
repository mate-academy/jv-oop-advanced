package core.basesyntax;

public class Main {
    private static final int FIGURES_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_LENGTH];
        for (int i = 0; i < FIGURES_LENGTH; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
