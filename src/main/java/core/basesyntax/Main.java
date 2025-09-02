package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < figures.length; i++) {
            if (i <= 2) {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i].draw());
            }else {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i].draw());
            }
        }
    }
}
