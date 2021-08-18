package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int list = (int) (Math.random() * 10);
        for (int i = 0; i < list; i++) {
            figureSupplier.getRandomFigure();
        }
    }
}
