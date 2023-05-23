package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();

        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
