package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[10];
        for (int i = 0; i < 10; i++) {
            FigureSupplier figureSupplier = new FigureSupplier();
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
