package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FIgureSupplier figureSupplier = new FIgureSupplier();
        FigureArea[] figure = new FigureArea[6];
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figureSupplier.getRandomFigure();
            } else {
                figureSupplier.getDefaultFigure();
            }
        }
    }
}
