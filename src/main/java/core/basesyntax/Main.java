package core.basesyntax;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static Figure[] figures = new Figure[6];

    public static void main(String[] args) {
        for (int i = 0; i < figures.length / 2 + 1; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figures.length - 1; i != figures.length / 2; i--) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
