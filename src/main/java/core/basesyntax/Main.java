package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        final int Array_Size = 6;
        Figure[] figures = new Figure[Array_Size];
        final int Half_Array = figures.length / 2;

        for (int i = 0; i < Half_Array; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = Half_Array; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.print());
        }
    }
}
