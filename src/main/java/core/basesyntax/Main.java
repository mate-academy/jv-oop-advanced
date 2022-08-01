package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final  int NUMBER = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < NUMBER; i++) {
            if (i < NUMBER / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].Draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].Draw();
            }
        }
    }
}
