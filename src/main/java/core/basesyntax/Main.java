package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int number = 6;
        Figure[] figure = new Figure[number];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < number; i++) {
            if (i < number / 2) {
                figure[i] = figureSupplier.getRandomFigure();
            } else {
                figure[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (int i = 0; i < number; i++) {
            figure[i].draw();
        }
    }
}
