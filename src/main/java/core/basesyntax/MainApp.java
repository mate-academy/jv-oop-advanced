package core.basesyntax;

public class MainApp {
    public static void main() {
        final int sizeOfArray = 6;
        Figure figures[] = new Figure[sizeOfArray];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < sizeOfArray / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = sizeOfArray / 2; i < sizeOfArray; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (int i = 0; i < sizeOfArray; i++) {
            figures[i].draw();
        }
    }
}
