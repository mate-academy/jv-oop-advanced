package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int figuresToPrint = 6;
        Figure[] figures = new Figure[figuresToPrint];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figureSupplier.getRandomFigure().printSquareInfo();
            } else {
                figureSupplier.getDefaultFigure().printSquareInfo();
            }
        }
    }
}
