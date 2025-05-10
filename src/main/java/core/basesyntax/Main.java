package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        final int size = 6;

        Figure[] figures = new Figure[size];

        for (int i = 0; i < size; i++) {
            figures[i] = (i < size / 2) ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.getInfo());
        }
    }
}
