package core.basesyntax;

public class Main {
    private static final int FIGURES_ARRAY_LANGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_ARRAY_LANGTH];
        for (int i = 0; i < FIGURES_ARRAY_LANGTH; i++) {
            if (i < FIGURES_ARRAY_LANGTH / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].getInfo();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].getInfo();
            }
        }
        for (Figure figure : figures) {
            System.out.println(figure.getInfo());
        }
    }
}
