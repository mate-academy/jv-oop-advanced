package core.basesyntax;

public class Application {
    private static final int MAX_VALUE = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[MAX_VALUE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].draw());
        }
    }
}
