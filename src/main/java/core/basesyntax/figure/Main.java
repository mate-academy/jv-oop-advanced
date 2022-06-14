package core.basesyntax.figure;

public class Main {
    public static void main(String[] args) {
        int count = 10;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] randomfigure = new Figure[count];
        for (int i = 0; i < count; i++) {
            if (i >= count / 2) {
                randomfigure[i] = figureSupplier.getDefaultFigure();
            } else {
                randomfigure[i] = figureSupplier.getRandomFigure();
            }
            randomfigure[i].draw();
        }
    }
}
