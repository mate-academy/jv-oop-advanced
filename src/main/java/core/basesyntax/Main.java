package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        DefaultFigureSupplier figureSupplier = new DefaultFigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
