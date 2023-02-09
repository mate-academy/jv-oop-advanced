package core.basesyntax;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i >= figures.length / 2) {
                setDefaultObjectToArrayAndPrintIt(figures, i);
            } else {
                setRandomObjectToArrayAndPrintIt(figures, i);
            }
        }
    }

    public static void setDefaultObjectToArrayAndPrintIt(Figure[] figures, int i) {
        figures[i] = figureSupplier.getDefaultFigure();
        System.out.println(figures[i]);
    }

    public static void setRandomObjectToArrayAndPrintIt(Figure[] figures, int i) {
        figures[i] = figureSupplier.getRandomFigure();
        System.out.println(figures[i]);
    }
}
