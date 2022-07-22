package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureBasket = new Figure[6];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figureBasket[i] = figureSupplier.getRandomFigure();
            } else {
                figureBasket[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (int i = 0; i < 6; i++) {
            figureBasket[i].draw();
        }
    }
}
