package core.basesyntax;

public class MainClass {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Figural[] figures = new Figural[6];

        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int j = 3; j < 6; j++) {
            figures[j] = figureSupplier.getDefaultFigure();
        }
    }
}