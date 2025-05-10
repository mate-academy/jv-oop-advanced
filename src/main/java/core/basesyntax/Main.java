package core.basesyntax;

public class Main {
    private static final int DEFAULT_ARRAYS = 3;

    public static void main(String[] args) {

        Figure[] figures = new Figure[DEFAULT_ARRAYS];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < (figures.length / 2) + 1) {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i].draw());
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i].draw());
            }
        }
    }
}
