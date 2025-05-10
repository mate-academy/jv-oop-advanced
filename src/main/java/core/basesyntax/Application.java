package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int lengthFigures = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[lengthFigures];
        for (int i = 0; i < figures.length; i++) {
            if (figures.length / 2 > i) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
