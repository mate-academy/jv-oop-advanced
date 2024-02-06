package core.basesyntax;

public class Main {
    public static final int figuresToPrint = 6;

    public static void main(String[] args) {

        Figure[] figures = new Figure[figuresToPrint];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figureSupplier.getRandomFigure().draw();
            } else {
                figureSupplier.getDefaultFigure().draw();
            }
        }
    }
}
