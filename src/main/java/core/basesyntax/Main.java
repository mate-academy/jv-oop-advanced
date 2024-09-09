package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Drawable[] figures = new Drawable[5];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Drawable figure : figures) {
            figure.draw();
        }

        Drawable defaultFigure = figureSupplier.getDefaultFigure();
        defaultFigure.draw();
    }
}
