package core.basesyntax;

public class Main {
    private static final int ARRAY_LENGTH = 8;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {

        Figure[] figures = new Figure[ARRAY_LENGTH];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].drawInfo();
        }

        System.out.println();

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].drawInfo();
        }
    }
}
