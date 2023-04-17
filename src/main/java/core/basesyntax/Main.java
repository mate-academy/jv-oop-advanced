package core.basesyntax;

public class Main {
    private static final int DEFAULT_ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[DEFAULT_ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i <= figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
