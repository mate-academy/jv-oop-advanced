package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int SizeArray = 6;
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[SizeArray];
        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
