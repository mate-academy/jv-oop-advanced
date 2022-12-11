package core.basesyntax;

public class Main {
    private static final int MAX_ARRAY = 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figures[] figures = new Figures[MAX_ARRAY];
        for (int i = 0; i < figures.length; i++) {
            if (i >= figures.length / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i].draw());
            } else {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i].draw());
            }
        }
    }
}
