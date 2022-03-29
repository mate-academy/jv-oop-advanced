package core.basesyntax;

public class Main {
    private static final int COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[COUNT];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
        System.out.println("\nPrint default figure: ");
        figureSupplier.getDefaultFigure().draw();
    }
}
