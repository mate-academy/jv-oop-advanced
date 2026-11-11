package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure [] arrayFigure = new Figure[6];

        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                arrayFigure[i] = figureSupplier.getRandomFigure();
            } else {
                arrayFigure[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (int i = 0; i < 6; i++) {
            arrayFigure[i].draw();
        }
    }
}
