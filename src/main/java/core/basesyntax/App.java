package core.basesyntax;

public class App {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure randomFigure = figureSupplier.getRandomFigure();
        int num = 7;
        for (int i = 1; i < num + 1; i++) {
            if (i <= ((num + 1) / 2)) {
                System.out.println(figureSupplier.getRandomFigure());
            } else {
                System.out.println(figureSupplier.getDefaultFigure());
            }
        }
    }
}
