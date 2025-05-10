package core.basesyntax;

public class Main {
    private static final int ARRAY_LENGTH = 8;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {

        Figure[] figures = new Figure[ARRAY_LENGTH];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < figures.length / 2
                    ? figureSupplier.getDefaultFigure()
                    : figureSupplier.getRandomFigure();
            figures[i].drawInfo();
        }
    }
}
