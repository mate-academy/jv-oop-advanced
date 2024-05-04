package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier randomFigureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[4];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = randomFigureSupplier.getRandomFigure();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
