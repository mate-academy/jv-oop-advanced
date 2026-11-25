package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[26];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < figures.length / 2
                    ? supplier.getRandomFigure()
                    : supplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.drawable();
        }
    }
}