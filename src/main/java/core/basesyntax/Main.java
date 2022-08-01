package core.basesyntax;

public class Main {
    private static final int KILK_FIGUR = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[KILK_FIGUR];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = (Figure) figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
