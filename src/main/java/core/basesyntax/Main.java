package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[10];
        for (int i = 0; i < 5; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 5; i < 10; i++) {
            figures[i] = FigureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
