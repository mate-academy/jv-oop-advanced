package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        AreaCalculator[] figures = new AreaCalculator[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            ((Drawable) figures[i]).draw();
        }
    }
}
