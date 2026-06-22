package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Drawable[] figures = new Drawable[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Drawable figure : figures) {
            figure.toDraw();
        }
    }

}
