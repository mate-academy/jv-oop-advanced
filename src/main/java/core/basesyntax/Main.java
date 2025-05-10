package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        int number = 6;

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < number; i++) {
            if (i < number / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
