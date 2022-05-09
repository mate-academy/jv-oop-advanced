package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        Figure[] figures = new Figure[6];
        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = supplier.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        for (Figure current : figures) {
            System.out.println(current.draw());
        }
    }
}
