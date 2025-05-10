package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[10];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
