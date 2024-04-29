package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        AreaCalculator [] figures = new AreaCalculator[6];
        final FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i % 2 == 0) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (AreaCalculator figure : figures) {
            if (figure instanceof Drawable) {
                ((Drawable) figure).draw();
            }
        }
    }
}
