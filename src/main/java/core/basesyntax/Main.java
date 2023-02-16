package core.basesyntax;

public class Main {
    private static final int numberOfFigures = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figures = new Figure[numberOfFigures];
        for (int i = 0; i < figures.length;i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.generateFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
