package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[3];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = supplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
