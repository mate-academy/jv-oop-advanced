package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i >= figures.length / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            }
        }
    }
}
