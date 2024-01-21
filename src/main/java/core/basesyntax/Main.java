package core.basesyntax;

public class Main extends FigureSupplier {
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2 + 1) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure showFigure : figures) {
            System.out.println(showFigure.info());
        }
    }
}
