package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int requestedNumber = 6;
        Figure[] list = new Figure [requestedNumber];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i <= 5; i++) {
            if (i <= 2) {
                list[i] = figureSupplier.getRandomFigure();
                list[i].draw();
            } else {
                list[i] = figureSupplier.getDefaultFigure();
                list[i].draw();
            }
        }
    }
}
