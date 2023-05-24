package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();

        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures[i] = supplier.getRandomFigure();
            } else {
                figures[i] = supplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
