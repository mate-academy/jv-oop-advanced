package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int ArrayLength = 6;

        Figure[] figures = new Figure[ArrayLength];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i <= figures.length / 2
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.print());
        }
    }
}
