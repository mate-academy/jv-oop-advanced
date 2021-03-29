package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int arrayLimit = 10;
        Figure[] figures = new Figure[arrayLimit];
        for (int i = 0; i < figures.length; i++) {
            FigureSupplier supplier = new FigureSupplier();
            figures[i] = supplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.drawFigure());
        }
    }
}
