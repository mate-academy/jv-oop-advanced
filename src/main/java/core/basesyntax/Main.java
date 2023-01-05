package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[10];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 5; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
