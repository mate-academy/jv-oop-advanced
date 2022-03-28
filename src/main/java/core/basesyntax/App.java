package core.basesyntax;

public class App {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure randomFigure = figureSupplier.getRandomFigure();
        int num = 8;
        for (int i = 0; i < num; i++) {
            if (i < num / 2) {
                System.out.println(figureSupplier.getRandomFigure());
            } else {
                System.out.println(figureSupplier.getDefaultFigure());
            }
        }
    }
}
