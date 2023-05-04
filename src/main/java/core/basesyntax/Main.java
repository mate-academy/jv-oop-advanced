package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Area[] figure = new Area[6];
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figureSupplier.getRandomFigure();
            }
            if (i > figure.length / 2) {
                figureSupplier.getDefaultFigure();
            }
        }
    }
}
