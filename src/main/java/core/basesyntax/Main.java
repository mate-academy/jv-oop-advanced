package core.basesyntax;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static final int COUNTFIGURES = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[COUNTFIGURES];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i % 2 == 0 ? figureSupplier.getDefaultFigure()
                    : figureSupplier.getRandomFigure();
        }
        for (Figure figure: figures) {
            System.out.println(figure.draw());
        }
    }
}
