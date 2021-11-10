package core.basesyntax;

public class MainClass {
    private static int i;

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int j = 3; j < 6; j++) {
            figures[j] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
