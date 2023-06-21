package core.basesyntax;

public class Application {
    public static final int MAX_FIGURES = 10;

    public static void main(String [] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figures = new Figure[MAX_FIGURES];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            System.out.println(figure.info());
        }
    }
}
