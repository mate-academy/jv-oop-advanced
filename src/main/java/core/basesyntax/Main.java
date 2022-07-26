package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 0;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];


            for (int i = 0; i < figures.length; i++) {
                figures[i] = figureSupplier.getRandomFigure();
            }


        for (Figure figure : figures) {
            figure.drawFigure();
            System.out.println("\n");
        }
    }
}
