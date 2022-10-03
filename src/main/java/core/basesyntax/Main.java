package core.basesyntax;

public class Main {
    private static final int QUANTITY = 8;

    public static void main(String[] args) {
        final FigureSupplier figureSupplier = new FigureSupplier();
        final Figure [] figures = new Figure[QUANTITY];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            System.out.println(figures[i].draw().toLowerCase());
        }
    }
}
