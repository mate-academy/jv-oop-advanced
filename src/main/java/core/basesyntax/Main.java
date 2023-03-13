package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();

        }

        for (int a = 3; a < 6; a++) {
            figures[a] = figureSupplier.getDefaultFigure();
        }

        for (int e = 0; e < figures.length; e++) {
            figures[e].draw();
        }
    }
}
