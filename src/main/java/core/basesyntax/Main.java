package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int j = 0; j < 3; j++) {
            figures[j] = figureSupplier.getRandomFigure();
            figures[j].draw();
        }
        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
