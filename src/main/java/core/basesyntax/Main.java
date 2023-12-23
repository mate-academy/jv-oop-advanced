package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure [] randomFigure = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 3; i++) {
            randomFigure[i] = figureSupplier.getRandomFigure();
            randomFigure[i + 3] = figureSupplier.getDefaultFigure();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(randomFigure[i]);
        }
    }
}
