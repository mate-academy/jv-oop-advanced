package core.basesyntax;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length / 2; i++) {
            figureSupplier.getRandomFigure().draw();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figureSupplier.getDefaultFigure().draw();
        }
    }
}
