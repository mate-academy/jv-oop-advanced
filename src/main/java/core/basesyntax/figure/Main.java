package core.basesyntax.figure;

public class Main {
    public static void main(String[] args) {
        int count = 10;
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < count; i++) {
            if (i >= count / 2) {
                figureSupplier.getDefaultFigure().draw();
            } else {
                figureSupplier.getRandomFigure().draw();
            }
        }
    }
}
