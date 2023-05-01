package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        AreaCalculator[] figure = new AreaCalculator[6];
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                System.out.println(figureSupplier.getRandomFigure());
            } else {
                System.out.println(figureSupplier.getDefaultFigure());
            }
        }
    }
}
