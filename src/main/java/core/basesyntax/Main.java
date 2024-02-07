package core.basesyntax;

public class Main {
    public static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figureSupplier.getRandomFigure().draw();
                System.out.println();
            } else {
                figureSupplier.getDefaultFigure().draw();
                System.out.println();
            }
        }
    }
}
