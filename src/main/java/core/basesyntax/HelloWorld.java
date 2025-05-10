package core.basesyntax;

public class HelloWorld {
    public static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i]);
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i]);
            }
        }
    }
}
