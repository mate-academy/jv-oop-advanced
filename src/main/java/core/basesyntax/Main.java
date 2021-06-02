package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int value = (int) (1 + Math.random() * 10);
        Figure[] figures = new Figure[value];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < value; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
    }
}
