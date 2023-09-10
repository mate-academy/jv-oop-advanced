package core.basesyntax;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static final Figure[] randomFigure = new Figure[6];
    public static void main(String[] args) {
        for (int i = 0; i < randomFigure.length; i++) {
            if (i < randomFigure.length / 2) {
                randomFigure[i] = figureSupplier.getRandomFigure();
            }
            else {
                randomFigure[i] = figureSupplier.getDefaultFigure();
            }
            randomFigure[i].printFigure();
        }
    }
}
