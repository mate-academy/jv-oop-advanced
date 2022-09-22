package core.basesyntax;

public class RunApplication {
    private static int numOfFigures = 10;
    private static int halfOfArray = numOfFigures / 2;
    private static FigureSupplier figureSuppluer = new FigureSupplier();

    public static void main(String[] args) {

        Figure[] figures = new Figure[numOfFigures];
        for (int i = 0; i < figures.length; i++) {
            if (i < halfOfArray) {
                figures[i] = figureSuppluer.getRandomFigure();
            } else {
                figures[i] = figureSuppluer.getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
