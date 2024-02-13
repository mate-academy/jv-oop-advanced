package core.basesyntax;

public class Main {
    private static final int SUM_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[SUM_FIGURES];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i].getPrint());
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i].getPrint());
            }
        }
    }
}
