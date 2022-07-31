package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 6; i++) {
            if (i >= 6 / 2) {
                figureSupplier.getDefaultFigure();
            } else {
                System.out.println(figureSupplier.getRandomFigure().info());
            }
        }
    }
}
